package Aula08;

import java.util.ArrayList;
import java.util.List;

public class Prato  implements Comparable<Alimento>{
    protected String nome;
    protected List<Alimento> prato;

    Prato(String nome){
        assert nome.length()>0;
        
        this.nome = nome;
        prato = new ArrayList<>();
    }

    public boolean addAlimento(Alimento alimento){
        return prato.add(alimento);
    }


    public String getNome(){
        return nome;
    }

    public double getPeso(){
        double total = 0;
        for(Alimento alimento : prato){
            total += alimento.getPeso();
        }
        return total;

    }

    public double getCalorias(){
        double total = 0;
        for(Alimento alimento : prato){
            total += alimento.getCalorias();
        }
        return total;

    }

    public double getProteinas(){
        double total = 0;
        for(Alimento alimento : prato){
            total += alimento.getProteina();
        }
        return total;
            }

    

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nPrato " + nome);
        for (Alimento alimento : prato){
            sb.append(alimento + "\n");
        }
        return sb.toString();
    }


    @Override
    public boolean equals(Object other){
        if(!(other instanceof Prato))
        return false;
        Prato that = (Prato) other;
        return this.nome.equals(that.nome);

    }

    @Override
    public int compareTo(Alimento other){
        return Double.compare((other.getCalorias()), this.getCalorias());
    }


    
}
