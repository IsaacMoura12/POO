package Aula11;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EnergyUsageReport {
    private Map<Integer, Customer> clientes;




    EnergyUsageReport(){
        clientes = new TreeMap<>();
    }

    public void load(String file){

        try(Scanner sc = new Scanner(new File(file))){

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] data = line.split("\\|");
                String id = data[0];
                int key = Integer.parseInt(id);
                List<Double> readings = new ArrayList<>();

                for (int i = 0; i < data.length; i++) {
                    readings.add(Double.parseDouble(data[i]));
                }
                Customer customer = new Customer(key, readings);
                clientes.put(key, customer);
            }

        } catch (FileNotFoundException e){
            System.out.println("File not Found: " + e.getMessage());
        }
    }

    public void addCustomer(Customer customer){
        if(clientes.containsKey(customer.getCustomerId())){
            System.out.println("Customer already stored");
        } else {
            clientes.put(customer.getCustomerId(), customer);
            System.out.println("Customer was stored");
        }
    }

    public void removeCustomer(int id){
        Customer removed = clientes.remove(id);
        if(removed == null){
            System.out.println("Customer does not exist");
        } else{
            System.out.println("Customer remvoed");
        }
        
    }

    public Customer getCustomer(int id){
        Customer customer = clientes.get(id);
        if(customer != null){
            return customer;
        } else {
            return null;
        }
    }

    public double calculateTotalUsage(int id){
        double reading = 0;
        Customer customer = clientes.get(id);
        if(customer == null){
            System.out.println("Customer does not exist");
            return reading;
        } else {
            List<Double> readings = customer.getMeterReadings();
            for(double read : readings){
                reading = reading + read;
            }
            return reading;
        }

    }

    public void generateReport(){
        System.out.println(String.format("%-15s %-15s", "Customer ID", "Meter Reading"));

    for(Map.Entry<Integer, Customer> entry : clientes.entrySet()) {
        Integer customerId = entry.getKey();
        Customer customer = entry.getValue();
        Double meterReading = calculateTotalUsage(customer.getCustomerId());

        System.out.println(String.format("%-15d %-15.2f", customerId, meterReading));
    }
    }

    public void generateReport(String file){

        try{
            PrintWriter pw = new PrintWriter(new FileWriter(new File(file)));
            pw.println(String.format("%-15s %-15s", "Customer ID", "Meter Reading"));

            for (Map.Entry<Integer, Customer> entry : clientes.entrySet()) {
                Integer customerId = entry.getKey();
                Customer customer = entry.getValue();
                Double meterReading = calculateTotalUsage(customer.getCustomerId());
    
                pw.println(String.format("%-15d %-15.2f", customerId, meterReading));
            }
            pw.close();
            System.out.println("Report written to file: " + file);
     

        } catch (IOException e ){
            System.out.println("Error writing report to file: " + file);
            e.printStackTrace();
        }
    }
    
}
