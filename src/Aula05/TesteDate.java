package Aula05;

import java.util.Scanner;

public class TesteDate {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        DateYMD date = new DateYMD(1,1,1);  
        
        
        while(true){    // MENU
            System.out.println("\nDate Operations:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");
            System.out.println("\nOption: ");

            int option = sc.nextInt();

            // OPTION 1 -> CREATE NEW DATE
            if(option == 1){                                
                System.out.println("\n(create new date)");
                System.out.println("day: ");
                int day = sc.nextInt();
                System.out.println("month: ");
                int month = sc.nextInt();
                System.out.println("year: ");
                int year = sc.nextInt();
                date = new DateYMD(day,month,year);

            // OPTION 2 -> SHOW DATE
            } else if(option == 2){
                System.out.println();
                System.out.println(date);
                
            // OPTION 3 -> INCREMENT DATE
            } else if ( option == 3){
                System.out.println("\n(increment date)");
                System.out.println("number of days: ");
                int days = sc.nextInt();
                date.increment(days);


            // OPTION 4 -> DECREMENT DATE    
            } else if (option == 4){
                System.out.println("\n(decrement date)");
                System.out.println("number of days: ");
                int days = sc.nextInt();
                date.decrement(days);

            // OPTION 0 -> EXIT   
            }else{
                break;
            }
        }
        sc.close();
    }
    
}
