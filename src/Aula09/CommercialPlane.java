package Aula09;

public class CommercialPlane extends Plane {
    private int numOfCrewMembers;

    public CommercialPlane(String id, Maker fabricante, String modelo, int ano, int maxPassageiros, double maxVelocidade, int numOfCrewMembers) {
            super(id, fabricante, modelo, ano, maxPassageiros, numOfCrewMembers);
            assert numOfCrewMembers>0;
            this.numOfCrewMembers = numOfCrewMembers;        
    }

    public int getCrew(){
        return numOfCrewMembers;
    }

    public void setCrew(int crew){
        this.numOfCrewMembers = crew;
    }

    @Override
    public String getPlaneType(){
        return "Commercial";
    }

    @Override
    public String toString(){
        return "Commercial Aircraft " + id + ": " + fabricante + " " + modelo + "| Year: " + ano + " MaxPax: " + maxPassageiros + ", MaxVel: " + maxVelocidade + ", Crew: " + numOfCrewMembers;

    }
}
