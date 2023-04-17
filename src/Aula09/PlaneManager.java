package Aula09;

import java.util.ArrayList;
import java.util.List;

public class PlaneManager {
    private List<Plane> frota;
    private List<Plane> frotaComercial;
    private List<Plane> frotaMilitar;

    public PlaneManager(){
        frota = new ArrayList<>();
    }

    public void addPlane(Plane plane){
        if(frota.contains(plane)){
            System.out.println("Plane already in the fleet!");

        } else {
            frota.add(plane);
        }
    }

    public void removePlane(String id){
        int flag = 0;
        for(Plane plane : frota){
            if(plane.getId().equals(id)){
                frota.remove(plane);
                flag++;
                System.out.println("Aircraft removed.");
            }
        }

        if(flag==0){
            System.out.println("No Aircraft with ID: " + id);
        }
    }


    public Plane searchPlane(String id){

        for(Plane plane : frota){
            if(plane.getId().equals(id)){
                return plane;
            }
        }
        return null;
    }

    public List<Plane> getCommercialPlanes(){
        frotaComercial = new ArrayList<>();

        for(Plane plane : frota){
            if(plane.getPlaneType().equals("Commercial")){
                frotaComercial.add(plane);
            }
        }
        return frotaComercial;
        
    }

    public List<Plane> getMilitaryPlanes(){
        frotaMilitar = new ArrayList<>();

        for(Plane plane : frota){
            if(plane.getPlaneType().equals("Military")){
                frotaMilitar.add(plane);
            }
        }
        return frotaMilitar;
        
    }

    public String printAllPlanes(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nAircraft List:\n");
        for(Plane plane : frota ){
            sb.append(plane + "\n");
        }
        return sb.toString();

    }


    public Plane getFastestPlane(){
        Plane fastest = frota.get(0);
        for(Plane plane : frota ){
            if(plane.getMaxVel()> fastest.getMaxVel()){
                fastest = plane;

            }
        }
        return fastest;
    }

}
