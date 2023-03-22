package Aula06;
import java.util.Scanner;

public class TesteContactos {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Contactos contacts = new Contactos();


        while(true){
            System.out.println("\nOperações:");
            System.out.println("1 - Inserir Contacto");
            System.out.println("2 - Alterar Contacto");
            System.out.println("3 - Apagar Contacto");
            System.out.println("4 - Procurar Contacto");
            System.out.println("5 - Listar Contactos");
            System.out.println("0 - sair");
            System.out.println("\nOption: ");

            int option = sc.nextInt();



            if(option==1){
                System.out.println("\nInserir Contacto");
            }

        }
        
    }
    
}
