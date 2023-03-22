package Aula05;

public class Calendar {

    private int year;
    private int weekday;        // dia da semana em que começa o ano (1-domingo e 7- sabado)
    private int[][] events;   // mes/ dia



    Calendar(int year, int weekday, int[][] events){
        assert weekday >=1 && weekday <=7;
        assert year>=1;
        this.year = year;
        this.weekday = weekday;
        this.events = events;
    }

    public int getYear(){
        return year;
    }

    public int getFirstWeekdayYear(){
        return weekday;
    }

    public int[][] getEvents(){
        return events;
    }

    
    public int getFirstWeekdayMonth(int month){
        assert month >= 1 && month <= 12;
    
        // algoritmo Zeller
        int q = 1;
        int m = month;
        int Y = year;
        if(m<3){
            m+=12;
            Y-=1;
        }
    
        int K = Y % 100;
        int J = Y / 100;
        int h = (q + 13*(m+1)/5 + K + K/4 + J/4 + 5*J) % 7;
    
        int weekdayMonth = (h + weekday - 1) % 7;
        if (weekdayMonth == 0) {
            weekdayMonth = 7;
        }
        return weekdayMonth;
    }
    
    public String printFirstWeekdayMonth(int weekdayMonth){
        if(weekdayMonth == 1){
            return "Sunday";
        } else if (weekdayMonth == 2){
            return "Monday";
        }else if (weekdayMonth == 3){
            return "Tuesday";
        }else if (weekdayMonth == 4){
            return "Wednesday";
        }else if (weekdayMonth == 5){
            return "Thursday";
        }else if (weekdayMonth == 6){
            return "Friday";
        }else if (weekdayMonth == 7){
            return "Saturday";
        }else return "Erro!";
    }
    


    public void addEvent(DateYMD date){
        events[date.getMonth()][date.getDay()]++;

    }


    public void removeEvent(DateYMD date){
        events[date.getMonth()][date.getDay()]--;

    }

    // Funções de Suporte para a função to string
    public static int monthDays(int month, int year){
        if(month == 2){
            if(isLeapYear(year)){
                return 29;
            }else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11){
                return 30;
        } else {
            return 31;
        }

    }

    public static boolean isLeapYear(int year){
        return ((year%4==0) && (year % 100 != 0)) || (year % 400 ==0);
    }




    
    public String printCalendarFull(Calendar calendar) {
        int month = 1;
    
        while (month <= 12) {
            String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            String header = meses[month - 1] + " " + year;
            for (int i = 0; i < (20 - header.length() / 2); i++) {
                System.out.print(" ");
            }
            System.out.println(header);
            System.out.println("Su Mo Tu We Th Fr Sa");
    
            int startWeekday = getFirstWeekdayMonth(month);
            for (int i = 1; i < startWeekday; i++) {
                System.out.print("   ");
            }
    
            int x = startWeekday - 1;
    
            for (int j = 1; j <= monthDays(month, year); j++) {
                if (events[month][j] > 0) {
                    System.out.printf("%2d*", j); // update events
                } else {
                    System.out.printf("%2d ", j);
                }
                x = x + 1;
                if (x >= 7) {
                    x = 0;
                    System.out.println();
                }
    
            }
            System.out.println("\n");
    
            month++;
    
        }
        return "Sucesso!";
    }
    


    public String printCalendarMonth(int month){
        assert month >=1 && month<=12;
        String[] meses = {"","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String mes = meses[month] + " " + year;
        for (int i = 0; i < (20 - mes.length() / 2); i++) {
            System.out.print(" ");
        }

        System.out.println(mes);
        System.out.println("Su Mo Tu We Th Fr Sa");

        int startWeekday = getFirstWeekdayMonth(month);
            for (int i = 1; i < startWeekday; i++) {
                System.out.print("   ");
            }

            int x = startWeekday - 1;


            for (int j = 1; j <= monthDays(month, year); j++) {
                System.out.printf("%2d ", j);
                x = x + 1;
                if (x >= 7) {
                    x = 0;
                    System.out.println();
                }
    
            }
            System.out.println("\n");

        return "Sucess!";
    }
    





    
}
