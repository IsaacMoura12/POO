package Aula07;

public class Circle extends Forma {
    private double radius;


    Circle(double radius,String color){
        super(color);
        assert radius >0;
        this.radius = radius;
        
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
        return "Circle with radius: " + radius + " and color " + color;
    }


    @Override
    public boolean equals(Object other){
        if(!(other instanceof Circle))
        return false;
        Circle that = (Circle) other;
        return this.radius == that.radius && this.color.equals(that.color);
    }
    
}
