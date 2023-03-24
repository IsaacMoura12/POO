package Aula07;

public class Circle extends Forma {
    private double radius;
    private String color;


    Circle(double radius,String color){
        assert radius >0;
        this.radius = radius;
        assert color.length()>0;
        this.color = color;
    }

    public String getColor(){
        return color;
    }


    public double getRadius(){
        return radius;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }


    @Override
    public String toString(){
        return "Circle with radius: " + radius;
    }


    @Override
    public boolean equals(Object other){
        if(!(other instanceof Forma))
        return false;
        Circle that = (Circle) other;
        return this.radius == that.radius && this.color.equals(that.color);
    }
    
}
