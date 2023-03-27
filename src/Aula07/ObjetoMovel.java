package Aula07;

public abstract class ObjetoMovel {
    protected int x;
    protected int y;
    protected int distance;


    ObjetoMovel(int x, int y , int distance){
        this.x = x;
        this.y = y;
        assert distance >=0;
        this.distance = distance;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getDistance(){
        return distance;
    }

    public int move(int x, int y){
        // mover objeto
        // calcular distancia
        return 0;
    }

    @Override
    public String toString(){
        return "Object is at coordinates: (" + x + "," + y + ")" + " and distance:" + distance; 
    }
    
    
}
