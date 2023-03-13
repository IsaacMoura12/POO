package Aula05;

public class Calendar {

    private int year;
    private int weekday;
    private int[][] events;   // mes/ dia



    Calendar(int year, int weekday, int[][] events){
        assert weekday >=1 && weekday <=7;
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

    // incompleto!
    public int getFirstWeekdayMonth(int month){
        assert month >= 1 && month <= 12;
        return 0;
    }


    public void addEvent(DateYMD date){
        events[date.getMonth()][date.getDay()] =+ 1;

    }


    public void removeEvent(DateYMD date){
        events[date.getMonth()][date.getDay()] =- 1;

    }





    
}
