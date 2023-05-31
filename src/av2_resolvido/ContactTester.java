package av2_resolvido;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ContactTester {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ContactManagerInterface contactManager = new ContactManager();
        
        // start by reading data from the file "contactos.txt"
        // not yet implemented
        // contactManager.load("contactos.txt");
        
        // create menu
        // note that you could (should) use the IO utils package created during the first classes
        String option;
        Contact contact;
        while (true) {
            // print all menu options
            System.out.print("Select option: ");
            option = sc.nextLine();

            switch (option) {
                case "1": 
                    createContact(contactManager);
                    break;
                case "2": 
                    modifyContact(contactManager);
                    break;
                case "3": 
                    deleteContact(contactManager);
                    break;
                case "4": 
                    contact = searchContactByName(contactManager);
                    if (contact!=null) System.out.println(contact);
                    else System.out.println("Contact not found.");
                    break;
                case "5": 
                    contact = searchContactByPhoneNumber(contactManager);
                    if (contact!=null) System.out.println(contact);
                    else System.out.println("Contact not found.");
                    break;
                case "6": 
                    contact = searchContactByEmail(contactManager);
                    if (contact!=null) System.out.println(contact);
                    else System.out.println("Contact not found.");
                    break;
                case "7": 
                    contactManager.listAllContacts();
                    break;
                case "8": 
                    contactManager.listContactsByName();
                    break;
                case "9": 
                    contactManager.listContactsByPhoneNumber();
                    break;
                case "10": 
                    contactManager.listContactsByEmail();
                    break;
                case "11": 
                    contactManager.listContactsByBirthDate();
                    break;
                case "12":
                    sc.close();
                    // save back to file
                    // not implemented yet
                    // contactManager.save("contactos.txt");
                    System.out.println("Bye");
                    System.exit(0);;
            }

        }


    }

    private static void createContact(ContactManagerInterface contactManager) {
        System.out.print("Contact name: ");
        String name = sc.nextLine();

        String phoneNumber = "";
        do {
            System.out.print("Phone number: ");
            phoneNumber = sc.nextLine();
        } while (!contactManager.validatePhoneNumber(phoneNumber));

        String email = "";
        do {
            System.out.print("E-mail: ");
            email = sc.nextLine();
        } while (!contactManager.validateEmail(email));

        LocalDate dob;
        System.out.print("Date of birth: ");
        do {
            String dobStr = sc.nextLine();
            try {
                dob = LocalDate.parse(dobStr);
                break;

            } catch (DateTimeParseException e) {
                System.out.print("Date of birth: ");                
            }
        } while (true);

        Contact contact = new Contact(name, Integer.parseInt(phoneNumber), email, null);
        contactManager.addContact(contact);
    }

    private static void modifyContact(ContactManagerInterface contactManager) {
    }

    private static void deleteContact(ContactManagerInterface contactManager) {
        Contact contact = searchContactByName(contactManager);
        contactManager.removeContact(contact);
    }

    private static Contact searchContactByName(ContactManagerInterface contactManager) {
        System.out.print("Contact name: ");
        String name = sc.nextLine();
        Contact contact = contactManager.searchContactByName(name);
        return contact;
    }

    private static Contact searchContactByPhoneNumber(ContactManagerInterface contactManager) {
        String phoneNumber = "";
        do {
            System.out.print("Phone number: ");
            phoneNumber = sc.nextLine();
        } while (!contactManager.validatePhoneNumber(phoneNumber));

        Contact contact = contactManager.searchContactByPhoneNumber(Integer.parseInt(phoneNumber));
        return contact;
    }

    private static Contact searchContactByEmail(ContactManagerInterface contactManager) {
        String email = "";
        do {
            System.out.print("E-mail: ");
            email = sc.nextLine();
        } while (!contactManager.validateEmail(email));

        Contact contact = contactManager.searchContactByEmail(email);
        return contact;
    }
    
}
