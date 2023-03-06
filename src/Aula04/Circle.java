package Aula04;

public class Circle {
    private double radius;


    Circle(double radius){
        this.setCircle(radius);
    }

    public void setCircle(double radius){
        assert radius > 0;
        this.radius = radius;
    }

    public String toString(){
        return "Circle with radius:" + radius;
    }
    
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    
    public boolean equals(Circle b){
        return radius == b.getRadius();
    }
}
