package Aula11;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;


public class Aeroporto {
    private Map<String,Companhia> companhias;
    private Map<String, Voo> voos;

    Aeroporto(){
        companhias = new LinkedHashMap<>();
        voos = new LinkedHashMap<>();
    }

    public void loadVoos(String file){

        try(Scanner sc = new Scanner(new File(file))){
            sc.nextLine();

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] data = line.split("\t");
                String time = data[0];
                String f_number = data[1];
                String origin = data[2];
                String delay;
                if(data.length ==4){
                     delay = data[3];
                } else {
                     delay = "";
                }
                Voo voo = new Voo(f_number, time, origin, delay);
                voos.put(f_number, voo);
            }
        } catch (FileNotFoundException e){
            System.out.println("File not Found" + e.getMessage());
        }
    }


    public void loadCompanhias(String file){
        try(Scanner sc = new Scanner(new File(file))){
            sc.nextLine();
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] data = line.split("\t");
                String sigla = data[0];
                String name = data[1];
                Companhia companhia = new Companhia(name, sigla);
                companhias.put(sigla, companhia);
            }
            
        } catch (FileNotFoundException e){
            System.out.println("File not Found" + e.getMessage());
        }
    }

    public String getCompanyName(String f_number, Map<String, Companhia> companhias){
        String name = f_number.substring(0, 3);
    if (Character.isLetter(name.charAt(2))) {
        // 3rd char is a letter
        name = f_number.substring(0, 3);
    } else if (name.charAt(2) == '\u0000') {
        // only 2 chars in the string
        name = f_number.substring(0, 2);
    } else {
        // 3rd char is a digit
        name = f_number.substring(0, 2);
    }
    
    Companhia comp = companhias.get(name);
    if (comp == null) {
        return "Indisponível";
    }
    
    return comp.getName();
    }

    public String getTime(String time, String delay){
        int minutes1 = getTimeInMinutes(time); // Convert time1 to minutes
        int minutes2 = getTimeInMinutes(delay); // Convert time2 to minutes
        int totalMinutes = minutes1 + minutes2; // Add the two times together
        int hours = totalMinutes / 60; // Compute the number of hours in the total time
        int minutes = totalMinutes % 60; // Compute the number of minutes in the total time
        return String.format("%02d:%02d", hours, minutes); // Format the result as hh:mm
    }

    private int getTimeInMinutes(String time) {
        if(time.isEmpty()){
            return 0;
        }
        String[] parts = time.split(":|\\."); // Split the time string into hours and minutes parts
        int hours = Integer.parseInt(parts[0]); // Convert the hours part to an integer
        int minutes = Integer.parseInt(parts[1]); // Convert the minutes part to an integer
        return hours * 60 + minutes; // Convert the time to minutes
    }


    public void generateReport(String file){
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(file));
            pw.println(String.format("%-15s %-15s %-25s %-25s %-15s %-15s", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs"));

            for(Map.Entry<String, Voo> entry : voos.entrySet()){
                Voo voo = entry.getValue();
                String hora = voo.getTime();
                String f_number = voo.getNumber();
                String name = getCompanyName(f_number, companhias);
                String origin = voo.getOrigin();
                String delay = voo.getDelay();
                String obs = getTime(hora, delay);
                if(hora.equals(obs)){
                    pw.println(String.format("%-15s %-15s %-25s %-25s %-15s", hora, f_number, name, origin, delay));


                } else{
                    pw.println(String.format("%-15s %-15s %-25s %-25s %-15s %-15s", hora, f_number, name, origin, delay, "Previsto:  " + obs));

                }
            }
            pw.close();
            System.out.println("Report written to file: " + file);

        } catch(IOException e){
            System.out.println("Error writing report to file: " + file);
            e.printStackTrace();
        }
    }

    public void generateReport(){
        System.out.println("Companhias:");
        for(Map.Entry<String, Companhia> entry : companhias.entrySet()){
            String sigla = entry.getKey();
            Companhia companhia = entry.getValue();
            System.out.println(sigla + " - " + companhia.getName());
        }
        System.out.println("\nVoos:");
        for(Map.Entry<String, Voo> entry : voos.entrySet()){
            String f_number = entry.getKey();
            Voo voo = entry.getValue();
            String hora = voo.getTime();
            String origin = voo.getOrigin();
            String delay = voo.getDelay();
            System.out.println(f_number + " - " + hora + " - " + origin + " - " + delay);
        }
    }

    public void CalculateDelays(){
        Map<String, Integer> delays = new TreeMap<>();
        for(Map.Entry<String, Voo> entry : voos.entrySet()){
            int atraso = 0;
            Voo voo = entry.getValue();
            String f_number = voo.getNumber();
            String delay = voo.getDelay();
            if(!(delay.isEmpty())){
                 atraso = atraso +getTimeInMinutes(delay);
        }

        String name = getCompanyName(f_number, companhias);
        if(name != null){
            int currentDelay = delays.getOrDefault(name, 0);
            delays.put(name, currentDelay + atraso);
        }

    }
    System.out.println("Atrasos");
    for(Map.Entry<String , Integer> entry : delays.entrySet()){
        
        String sigla = entry.getKey();
        Integer delay = entry.getValue();
        System.out.println(sigla + " - " + delay + " minutos ");
    }  
}

public void getAverageDelay(){
    System.out.println();
    Map<String, int[]> delays = new LinkedHashMap<>();
    for (Map.Entry<String, Voo> entry : voos.entrySet()) {
        Voo voo = entry.getValue();
        String f_number = voo.getNumber();
        String delay = voo.getDelay();
        if (!delay.isEmpty()) {
            int delayTime = getTimeInMinutes(delay);
            String name = getCompanyName(f_number, companhias);
            int[] airlineDelayInfo = delays.getOrDefault(name, new int[]{0, 0});
            airlineDelayInfo[0] += delayTime;
            airlineDelayInfo[1] += 1;
            delays.put(name, airlineDelayInfo);
        } else {
            String name = getCompanyName(f_number, companhias);
            int[] airlineDelayInfo = delays.getOrDefault(name, new int[]{0, 1});
            delays.put(name, airlineDelayInfo);
        }
    }

    System.out.println(String.format("%-25s %-15s", "Companhia", "Atraso Médio"));
    for (Map.Entry<String, int[]> entry : delays.entrySet()) {
        String airlineName = entry.getKey();
        int[] delayInfo = entry.getValue();
        int totalDelay = delayInfo[0];
        int numFlights = delayInfo[1];
        double averageDelay = (double) totalDelay / numFlights;
        System.out.println(String.format("%-25s %-5f", airlineName, averageDelay));

    }
}

    public void CityReport(String file){
        Map<String, Integer> cidades = new TreeMap<>();
    try {
        PrintWriter pw = new PrintWriter(new FileWriter(file));

        pw.println(String.format("%-25s %-15s", "Origem", "Voos"));
        for (Map.Entry<String, Voo> entry : voos.entrySet()) {

            Voo voo = entry.getValue();
            String origem = voo.getOrigin();
            int visita = cidades.getOrDefault(origem, 0);
            cidades.put(origem, visita + 1);
        }

        // Sort the cities by visit count using a custom Comparator
        List<Map.Entry<String, Integer>> sortedCidades = new ArrayList<>(cidades.entrySet());
        sortedCidades.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        // Write the report to file
        for (Map.Entry<String, Integer> entry : sortedCidades) {
            String cidade = entry.getKey();
            int visitas = entry.getValue();
            pw.println(String.format("%-25s %-15d", cidade, visitas));
        }
        pw.close();
        System.out.println("Report written to file: " + file);
    } catch (IOException e) {
        System.out.println("Error writing report to file: " + file);
        e.printStackTrace();
    }
}

}
