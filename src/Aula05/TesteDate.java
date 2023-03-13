package Aula05;
import java.util.Scanner;

public class TesteDate {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Date date = new Date(1,1,0);  
        
        
        while(true){    // MENU
            System.out.println("\nDate Operations:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");
            System.out.println("\nOption: ");

            int option = sc.nextInt();
            if(option == 1){                                
                System.out.println("\n(create new date)");
                System.out.println("day: ");
                int day = sc.nextInt();
                System.out.println("month: ");
                int month = sc.nextInt();
                System.out.println("year: ");
                int year = sc.nextInt();
                date = new Date(day,month,year);
            } else if(option == 2){
                System.out.println(date);
                
            } else if ( option == 3){
                System.out.println("\n(increment date)");
                System.out.println("number of days: ");
                int days = sc.nextInt();
                date.increment(days);
            } else if (option == 4){
                System.out.println("\n(decrement date)");
                System.out.println("number of days: ");
                int days = sc.nextInt();
                date.decrement(days);
            }else{
                break;
            }
        }
        sc.close();
    }
    
}
