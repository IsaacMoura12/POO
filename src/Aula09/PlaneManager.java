package Aula09;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

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
        Iterator<Plane> iterator = frota.iterator();
    boolean found = false;
    while (iterator.hasNext()) {
        Plane plane = iterator.next();
        if (plane.getId().equals(id)) {
            iterator.remove();
            found = true;
            System.out.println("Aircraft removed.");
        }
    }
    if (!found) {
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

    public String getCommercialPlanes(){
        frotaComercial = new ArrayList<>();
        
        for(Plane plane : frota){
            if(plane.getPlaneType().equals("Commercial")){
                frotaComercial.add(plane);
            }
        }
        if(frotaComercial.isEmpty()){
            return "\nNo Commercial Aircrafts in the fleet!\n";
        }


        
        StringBuilder sb = new StringBuilder();
        sb.append("Commercial Aircraft List:\n");
        for(Plane plane : frotaComercial){
            sb.append(plane + "\n");
        }
        return sb.toString();

        
    }

    public  String getMilitaryPlanes(){
        frotaMilitar = new ArrayList<>();

        for(Plane plane : frota){
            if(plane.getPlaneType().equals("Military")){
                frotaMilitar.add(plane);
            }
        }

        if(frotaMilitar.isEmpty()){
            return "\nNo Military Aircrafts in the fleet!\n";
 
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Military Aircraft List:\n");
        for(Plane plane : frotaMilitar){
            sb.append(plane + "\n");
        }
        return sb.toString();


        
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
        System.out.println("\nFastest Aircraft in the fleet:\n");
        return fastest;
    }

}
