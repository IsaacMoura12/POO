package Avaliacao22;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class ContactManager implements ContactManagerInterface {

    private Map<Integer, Contact> agenda;

    ContactManager(){
        agenda  = new TreeMap<>();
    }

    public void load(String filePath){

        try(Scanner sc = new Scanner(new File(filePath))){
            
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] data = line.split("\t");
                String name = data[0];
                String tel = data[1];
                int phone = Integer.parseInt(tel);
                String email = data[2];
                String date = data[3];
                LocalDate birth = LocalDate.parse(date);

                Contact contact = new Contact(name, phone, email, birth);
                agenda.put(contact.getID(), contact);
            }

            System.out.println("Contacts Loaded");
        } catch (FileNotFoundException e){
            System.out.println("File not Found" + e.getMessage());
        }

    }

    public void save(String filePath){

        try{
            PrintWriter pw = new PrintWriter(new FileWriter(filePath));

            for(Map.Entry<Integer, Contact> entry : agenda.entrySet()){
                    Contact contact = entry.getValue();

                    String name = contact.getName();
                    String email = contact.getEmail();
                    int tel = contact.getPhone();
                    LocalDate date = contact.getBirthDate();
                    pw.println(String.format("%-\ts %-\ts %-\ts %-\ts", name,tel,email,date ));
            }



        pw.close();
        System.out.println("Written to file: " + filePath);
        
        } catch (IOException e){
            System.out.println("Error writing report to file: " + filePath);
            e.printStackTrace();
        }

    }

    public boolean validateEmail(String email){
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validatePhoneNumber(String phoneNumber){
        if(phoneNumber.length()!=9){
            return false;
        } else {

            char[] array = phoneNumber.toCharArray();
            for (int i = 0; i < array.length; i++) {
                char c = array[i];
                if(!(Character.isDigit(c))){
                    return false;
                }
                
            }
        }
        return true;

    }

    public boolean addContact(Contact person){

        if (agenda.containsValue(person)){
            return false;
        } else{
            agenda.put(person.getID(), person);

            return true;
        }
    }

    public boolean  removeContact(Contact person){
        if(!(agenda.containsValue(person))){
            return false;

        } else{
            agenda.remove(person.getID());
            return true;
        }

    }

    public Contact searchContactByname(String name){
        for(Map.Entry<Integer, Contact> entry : agenda.entrySet()){
            Contact contact = entry.getValue();
            if(contact.getName().equals(name)){
                return contact;
            }
        }

        return null;

    }

   public Contact searchContactByEmail(String email){

    for(Map.Entry<Integer, Contact> entry : agenda.entrySet()){
        Contact contact = entry.getValue();
        if(contact.getEmail().equals(email)){
            return contact;
        }
    }

    return null;

    }

     public Contact searchContactByPhoneNumber(int phoneNumber){

        for(Map.Entry<Integer, Contact> entry : agenda.entrySet()){
            Contact contact = entry.getValue();
            if(contact.getPhone()== phoneNumber){
                return contact;
            }
        }
    
        return null;
     }


     public void listAllContacts(){
        for(Map.Entry<Integer, Contact> entry : agenda.entrySet()){
            Contact contact = entry.getValue();
            System.out.println(contact);
        }

     }


     public void listContactsByName(){

        Map<String, Contact> tmp = new TreeMap<>();

        for(Map.Entry<Integer, Contact> entry : agenda.entrySet()){
            Contact contact = entry.getValue();

            tmp.put(contact.getName(), contact);
        }

        for(Map.Entry<String, Contact> entry : tmp.entrySet()){
            Contact contact = entry.getValue();

            System.out.println(contact);
        }

     }


     public void listContactsByPhoneNumber(){

        Map<Integer, Contact> tmp = new TreeMap<>();

        for(Map.Entry<Integer, Contact> entry : agenda.entrySet()){
            Contact contact = entry.getValue();

            tmp.put(contact.getPhone(), contact);
        }

        for(Map.Entry<Integer, Contact> entry : tmp.entrySet()){
            Contact contact = entry.getValue();

            System.out.println(contact);
        }


     }


     public void listContactsByBirthDate(){

        Map<LocalDate, Contact> tmp = new TreeMap<>();

        for(Map.Entry<Integer, Contact> entry : agenda.entrySet()){
            Contact contact = entry.getValue();

            tmp.put(contact.getBirthDate(), contact);
        }

        for(Map.Entry<LocalDate, Contact> entry : tmp.entrySet()){
            Contact contact = entry.getValue();

            System.out.println(contact);
        }


     }






    
    
}
