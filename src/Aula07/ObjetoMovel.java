package Aula07;

public abstract class ObjetoMovel {
    protected int x;
    protected int y;
    protected double distance;


    ObjetoMovel(int x, int y , double distance){
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

    public void setX(int x){
        this.x = x;

    }

    public void setY(int y){
        this.y = y;
    }

    public double getDistance(){
        return distance;
    }

    public void move(int xx, int yy){
        setX(xx);
        setY(yy);
        int deltax = this.x - xx;
        int deltay = this.y - yy;
        double moved = Math.sqrt(deltax*deltax + deltay*deltay);
        this.distance = this.distance + moved;

        // mover objeto
        // calcular distancia
    }

    @Override
    public String toString(){
        return "Object is at coordinates: (" + x + "," + y + ")" + " and distance:" + distance; 
    }
    
    
}
