package Aula08;

import java.util.ArrayList;
import java.util.List;

public class PratoVegetariano extends Prato {
    protected String nome;
    protected List<Alimento> prato;

    PratoVegetariano(String nome){
        super(nome);
        prato = new ArrayList<>();
    }

    @Override
    public boolean addAlimento(Alimento alimento){
        if(alimento.getVeg()){
            return prato.add(alimento);


        }
        return false;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nPrato Vegetariano " + nome);
        for (Alimento alimento : prato){
            sb.append(alimento + "\n");
        }
        return sb.toString();
    }

    
}
