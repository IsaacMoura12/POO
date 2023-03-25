package Aula07;

public class Rectangle extends Forma{
    private double height;
    private double length;
    private String color;


    Rectangle(double height, double lenght ,String color){
        assert this.height > 0;
        assert this.length > 0;
        assert color.length() >0;
        this.height = height;
        this.length = lenght;
        this.color = color;
    }

    @Override
    public double perimeter(){
        return height * 2 + length * 2;
    }

    @Override
    public double area(){
        return height * length;
    }

    public double getHeight(){
        return height;
    }

    public double getLength(){
        return length;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return "Rectangle with Length: " + length + " and Height: " + height + " and  " + color;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Rectangle))
        return false;
        Rectangle that = (Rectangle) other;

        return this.length == that.length && this.height == that.height && this.color.equals(that.color);
    }



    
    
}