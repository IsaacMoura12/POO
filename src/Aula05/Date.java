package Aula05;



// Classe Date (year,month,day)
/* set - > atribuir data -> chama os metodos Valid para validar data
 * valid -> verifica se a data é válida -> chama os métodos daysMonth e leap year
 * 
 * 
 * 
 * 
*/

public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year){
    this.set(day,month,year);
}

public void set(int day, int month, int year){
    if(valid(year,month,day)){
        this.day = day;
        this.month = month;
        this.year = year;
    }
}


public int getDay(){
    return day;
}

public int getMonth(){
    return month;
}

public int getYear(){
    return year;
}

@Override
public String toString(){
    return String.format("%04d-%02d-%02d", this.day, this.month, this.year);

}

@Override
public boolean equals(Object other){
    if(!(other instanceof Date))
    return false;
    Date that = (Date) other;
    return this.year == that.year && this.month == that.month && this.day == that.day;

}

public boolean valid(int day, int month, int year){
    if(year<= 0) return false;
    if(month< 1 || month>12) return false;
    if(day< 1 || day > monthDays(month, year)) return false;
    return true;

}

public boolean validMonth(int month){
    return month>=1 && month<= 12;
}



public boolean isLeapYear(int year){
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
}
