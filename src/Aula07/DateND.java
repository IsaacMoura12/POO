package Aula07;

// Classe que devolve contagem de dias (distância) até uma data passada como parametro
// em vez de ser só 1 janeiro 2000

public class DateND extends Date {
    private int daysSince;
    
    


    public DateND(int day, int month, int year, int daysSince){
        super(day,month,year);
        this.daysSince = daysSince;
        increment(daysSince);

    }

    @Override
    public String toString(){
        return String.format("%04d days after %04d-%02d-%02d", this.daysSince,this.year, this.month, this.day);

    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DateND)) {
            return false;
        }
        DateND that = (DateND) other;
        return this.daysSince == that.daysSince && this.day == that.day && this.month == that.month && this.year== that.year;
    }


    }