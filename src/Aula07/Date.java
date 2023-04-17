package Aula07;

public abstract class Date  {
    protected int day;
    protected int month;
    protected int year;

    public Date(int day, int month, int year){
        if(valid(day,month,year)){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    }

    // Metodos comuns a todas Date

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }
    
    public int getYear(){
        return year;
    }

    public boolean valid(int day, int month, int year){
        if(year<= 0) return false;
        if(month< 1 || month>12) return false;
        if(day< 1 || day > monthDays(month, year)) return false;
        return true;
    }

    public boolean validMonth(int month){
        return month >= 1 && month <=12;
    }

    public boolean isLeapYear(int month){
        return ((year%4==0) && (year % 100 != 0)) || (year % 400 ==0);
      
    }

    public int monthDays(int month, int year){
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

    public void increment(int days){
        while(days >0){
        if(day == monthDays(month, year)){
            day =1;
            if(month == 12){
                month = 1;
                year++;
    
            }else{
                month++;
            }
        } else{
            day++;
        }
        days--;
    }
    }
    
    public void decrement(int days){
        while(days > 0){
        if(day == 1){
            if(month ==1){
                year--;
                month = 12;
                day = monthDays(month, year);
            }else{
                month--;
                day = monthDays(month, year);
            }
        }else{
            day--;
        }
        days--;
    }
    }


     
    // Metodos que variam com tipo de Date:

    public abstract String toString();

    public abstract boolean equals(Object other);


    
}
