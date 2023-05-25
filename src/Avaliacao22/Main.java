package Avaliacao22;

import java.io.IOException;

import java.util.Scanner;
import java.time.LocalDate;



public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ContactManager manager = new ContactManager();
        System.out.println(manager);

        manager.load("src/Avaliacao22/contactos.txt");


        int choice;
        do {
            System.out.println("\nLista Telefónica Operacões:");
            System.out.println("1 - Adicionar contacto ");
            System.out.println("2 - Modificar Contacto");
            System.out.println("3 - Apagar contacto");
            System.out.println("4 - Procurar contacto por nome");
            System.out.println("5 - Procurar contacto por telemovel");
            System.out.println("6 - Procurar contacto por email");
            System.out.println("7 - Listar Contactos ");
            System.out.println("8 - Listar contactos por nome");
            System.out.println("9 - Listar contactos por telemovel");
            System.out.println("10 -Listar contactos por data de nascimento ");
            System.out.println("0 - sair");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                // para teste:
                //LocalDate date = LocalDate.of(2002, 2, 16);
                
                //Contacto contact = new Contacto("Isaac Moura", 911021313, "isaac.moura@ua.pt",date);


                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
            
                    break;
                    
                case 6:
                System.out.println("Procurando por maria@ua.pt");
                manager.searchContactByEmail("maria2ua.pt");
                System.out.println(manager.searchContactByEmail("maria2ua.pt")
                );
                    break;
                case 7:
                manager.listAllContacts();
                    
                    break;

                case 8:
                manager.listContactsByName();

                    break;

                case 9 :
                manager.listContactsByPhoneNumber();

                    break;
                case 10:
                manager.listContactsByBirthDate();



                break;

                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }


    }
    

