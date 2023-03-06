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
        return this.side1 + this.side2 + this.side3;
    }

    public double area(){
        double s = this.perimeter()/2;
        return Math.sqrt(s * (s-this.side1) * (s-this.side2) * (s-this.side3));
    }

    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }

    @Override
    public String toString(){
        return "Triangle with sides:" + this.side1 + " : " +  this.side2 + " : " + this.side3;
    }

    
    public boolean equals(Triangle b){
        return this.side1 == b.getSide1() && this.side2 == b.getSide2() && this.side3 == b.getSide3();
    }

}
