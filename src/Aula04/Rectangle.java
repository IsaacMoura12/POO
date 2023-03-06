package Aula04;

public class Rectangle {
    private double height;
    private double length;


    Rectangle(double height, double length){
        this.setRectangle(height, length);
    }

    public void setRectangle(double height, double length){
        assert this.height > 0;
        assert this.length > 0;

        this.height = height;
        this.length = length;
    }

    public double perimeter(){
        return height * 2 + length * 2;
    }

    public double area(){
        return height * length;
    }

    public double getHeight(){
        return height;
    }

    public double getLength(){
        return length;
    }

    @Override
    public String toString(){
        return "Rectangle with Length:" + length + " and Height: " + height;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Rectangle))
        return false;
        Rectangle that = (Rectangle) other;

        return this.length == that.length && this.height == that.height;
    }
    
}
