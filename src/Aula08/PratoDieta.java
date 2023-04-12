package Aula08;

import java.util.ArrayList;
import java.util.List;

public class PratoDieta extends Prato{

    protected String nome;
    protected List<Alimento> prato;
    protected double maxCal;

    PratoDieta(String nome, double maxCal){
        super(nome);
        assert maxCal >0;
        this.maxCal = maxCal;
        prato = new ArrayList<>();
    }

    @Override
    public boolean addAlimento(Alimento alimento){
        if(this.getCalorias() < maxCal){
             return prato.add(alimento);
        }
        return false;
    }

    public double getMaxCal(){
        return maxCal;
    }



    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nPrato Dieta " + nome);
        for (Alimento alimento : prato){
            sb.append(alimento + "\n");
        }
        return sb.toString();
    }
    
}
