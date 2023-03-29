package Aula07;

public class Ball extends ObjetoMovel{
    protected String color;



    Ball(int x, int y , double distance, String color){
        super(x,y,distance);
        assert color.length()>0;
        this.color = color;


    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return "Ball with color: " + color;
    }
    
}
