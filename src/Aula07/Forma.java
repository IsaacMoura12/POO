package Aula07;

public abstract class Forma {
    
    protected String color;


    Forma(String color){
        assert color.length()>0;
        this.color = color;
    }
    public abstract double area();
    public abstract double perimeter();


    public String getColor(){
        return color;
    }

    
}
