package Avaliacao22;

import java.io.IOException;

import java.util.Scanner;
import java.time.LocalDate;



public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
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
            System.out.println();
            System.out.print("Operação: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                sc.nextLine();
                System.out.println("Insira o nome: ");
                String nome = sc.nextLine();
                while(nome.length()==0){
                    System.out.println("Insira o nome: ");
                    nome = sc.nextLine();
                }

                System.out.println("Insira número de telemóvel: ");
                String phone = sc.nextLine();
                while(!(manager.validatePhoneNumber(phone)) ){
                    System.out.println("Número Inválido: ");
                    phone = sc.nextLine();
                }

                int tel = Integer.parseInt(phone);

                System.out.println("Insira o endereço de email: ");
                String email = sc.nextLine();
                while(!(manager.validateEmail(email))){
                    System.out.println("Email Inválido: ");
                    email = sc.nextLine();
                }

                System.out.println("Insira a data de nascimento\n");
                System.out.println("Dia:");
                int dia = sc.nextInt();

                System.out.println("Mês:");
                int mes = sc.nextInt();

                System.out.println("Ano:");
                int ano = sc.nextInt();

                LocalDate date = null;
                boolean validDate = false;
                while (!validDate) {
                try {
                    date = LocalDate.of(ano, mes, dia);
                    validDate = true;
                } catch (Exception e) {
                    System.out.println("Data Inválida. Insira data válida.");
                    System.out.println("Dia:");
                    dia = sc.nextInt();
                    System.out.println("Mês:");
                    mes = sc.nextInt();
                    System.out.println("Ano:");
                    ano = sc.nextInt();
            }
        }

                Contact contact = new Contact(nome, tel, email, date);
                if(manager.addContact(contact)){
                    System.out.println("Contacto Adicionado.");
                } else {
                    System.out.println("Contacto já existe!");
                }

                    break;
                case 2:
                    break;
                case 3:
                sc.nextLine();
                System.out.println("Nome do contacto a apagar: ");
                String name = sc.nextLine();
                while(name.length()==0){
                    System.out.println("Nome: ");
                    name = sc.nextLine();
                }

                Contact contacto = manager.searchContactByname(name);
                if(!(manager.removeContact(contacto))){
                    System.out.println();
                    System.out.println("Contacto não existe.");
                } else {
                    System.out.println();
                    System.out.println("Contacto removido.");
                }

                    break;
                case 4:
                sc.nextLine();
                System.out.println("Insira o nome do contacto a procurar: ");
                nome = sc.nextLine();

                while(nome.length()==0){
                    System.out.println("Nome: ");
                    nome = sc.nextLine();
                }

                 contacto = manager.searchContactByname(nome);

                if(contacto == null){
                    System.out.println();
                    System.out.println("Nenhum contacto encontrado.");
                } else {
                    System.out.println(contacto);
                }

                    break;
                    
                case 5:
                sc.nextLine();
                System.out.println("Insira o número de telemóvel do contacto a procurar: ");
                String tele = sc.nextLine();
                while(tele.length()==0){
                    System.out.println("Número de telemóvel: ");
                    tele = sc.nextLine();
                }

                int telemovel = Integer.parseInt(tele);
                Contact match = manager.searchContactByPhoneNumber(telemovel);
                if ( match == null){
                    System.out.println();
                    System.out.println("Nenhum contacto encontrado.");
                } else {
                    System.out.println(match);
                }
            
                    break;
                    
                case 6:
                sc.nextLine();
                System.out.println("Insira email do contacto a procurar:");
                email = sc.nextLine();

                while(!(manager.validateEmail(email))){
                    System.out.println("Email Inválido: ");
                    email = sc.nextLine();
                }

                contacto = manager.searchContactByEmail(email);
                if(contacto == null){
                    System.out.println();
                    System.out.println("Nenhum contacto encontrado.");
                } else {
                    System.out.println(contacto);
                }

                
                    break;
                case 7:
                System.out.println("\nContactos:\n");
                manager.listAllContacts();
                System.out.println();
                    break;

                case 8:
                System.out.println("\nContactos ordenados por nome:\n");
                manager.listContactsByName();
                System.out.println();


                    break;

                case 9 :
                System.out.println("\nContactos ordenados por número de telemóvel:\n");
                manager.listContactsByPhoneNumber();
                System.out.println();
                      break;

                case 10:
                System.out.println("\nContactos ordenados por data de nascimento:\n");
                manager.listContactsByBirthDate();
                System.out.println();

                break;

                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }


    }
    

