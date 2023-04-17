package Aula09;


public class MilitaryPlane extends Plane {
    private int numMissiles;

    public MilitaryPlane(String id, String fabricante, String modelo, int ano, int maxPassageiros, int maxVelocidade, int numMissiles) {
        super(id, fabricante, modelo, ano, maxPassageiros, maxVelocidade);
        assert numMissiles>=0;
        this.numMissiles = numMissiles;
    }

    public int getMissiles(){
        return numMissiles;
    }

    public void setMissiles(int missiles){
        this.numMissiles = missiles;
    }

    @Override
    public String getPlaneType(){
        return "Military";
    }

    @Override
    public String toString(){
        return "Military Aircraft " + id + ": " + fabricante + " " + modelo + "| Year: " + ano + " MaxPax: " + maxPassageiros + ", MaxVel: " + maxVelocidade + ", Missiles: " + numMissiles;
 

    }
}