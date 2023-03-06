package Aula04;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    

    Triangle(double side1, double side2, double side3){
        this.setTriangle(side1,side2,side3);
    }

    public void setTriangle(double side1, double side2, double side3){
        
        assert side1 > 0;
        assert side2 > 0;
        assert side3 > 0;
        assert side1 + side2 > side3 || side2 + side3 > side1 || side1 + side3 >= side2;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double perimeter(){
        return side1 + side2 + side3;
    }

    public double area(){
        double s = perimeter()/2;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
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
    public String toString(){
        return "Triangle with sides:" + side1 + " : " +  side2 + " : " + side3;
    }

    
    public boolean equals(Triangle b){
        return side1 == b.getSide1() && side2 == b.getSide2() && side3 == b.getSide3();
    }

}
