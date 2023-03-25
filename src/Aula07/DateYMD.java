package Aula07;

public class DateYMD extends Date {
   
    DateYMD(int day, int month, int year){
        super(day,month,year);
    }


@Override
public String toString(){
    return String.format("%04d-%02d-%02d", this.year, this.month, this.day);
}

@Override
public boolean equals(Object other){
    if(!(other instanceof DateYMD))
    return false;
    DateYMD that = (DateYMD) other;
    return this.year == that.year && this.month == that.month && this.day == that.day;

}
   
}
