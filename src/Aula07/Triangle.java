package Aula07;

public class Triangle extends Forma{
    private double side1;
    private double side2;
    private double side3;
    private String color;


    Triangle(double side1, double side2, double side3, String color){
        assert side1 > 0;
        assert side2 > 0;
        assert side3 > 0;
        assert side1 + side2 > side3 || side2 + side3 > side1 || side1 + side3 >= side2;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        assert color.length()>0;
        this.color= color;
    }


    public String getColor(){
        return color;

    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }

    @Override
    public double perimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public double area(){
        double s = perimeter()/2;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }

    @Override
    public String toString(){
        return "Triangle with sides: " + side1 + " : " +  side2 + " : " + side3 + " and color " + color;
    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Triangle))
        return false;
        Triangle that = (Triangle) other;

        return this.side1 == that.side1 && this.side2 == that.side2 && this.side3 == that.side3 && this.color.equals(that.color);
    }


    
}
