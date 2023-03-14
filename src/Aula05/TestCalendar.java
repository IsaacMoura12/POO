package Aula05;
import java.util.Scanner;

public class TestCalendar {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Calendar cal = new Calendar(1,1,null);

        // TESTES:
        //cal.printCalendarFull();
        //cal.getFirstWeekdayMonth(2);
        //System.out.print(cal.getFirstWeekdayMonth(2));
        //System.out.println(cal.printFirstWeekdayMonth(cal.getFirstWeekdayMonth(4)));




        while(true){ // MENU
            System.out.println("\nCalendar Operations:");
            System.out.println("1 - Create New Calendar");
            System.out.println("2 - Print Calendar Month");
            System.out.println("3 - Print Entire Calendar");
            System.out.println("4 - Add Event");
            System.out.println("0 - exit");
            System.out.println("\nOption: ");

            int option = sc.nextInt();


            // OPTION 1 -> CREATE NEW CALENDAR
            if(option == 1){
                System.out.println("\n(Create New Calendar)");
                System.out.println("Year: ");
                int year = sc.nextInt();
                System.out.println("First Weekday of the Year (1- Sunday ... 7- Saturday): ");
                int weekday = sc.nextInt();

                int[][] array = new int[13][367];
                for (int i = 0; i < 13; i++) {
                    for (int j = 0; j < 367; j++) {
                        array[i][j] = 0;  
                    } 
                } 
                cal = new Calendar(year,weekday,array);

            // OPTION 2 -> SHOW CALENDAR MONTH
            }else if (option == 2){
                System.out.println();
                // incompleto!!!

            // OPTION 3 -> SHOW FULL CALENDAR
            }else if (option == 3){
                cal.printCalendarFull(cal);

            // OPTION 4 -> MARK EVENT
            }else if (option == 4){
                // incompleto !!
                System.out.println();

            // OPTION 0 -> EXIT
            }else{
                break;
            }





        }

        sc.close();
    }
    
}
