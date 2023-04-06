package Aula08;

import java.util.ArrayList;
import java.util.List;

public class Prato {
    protected String nome;
    protected List<Alimento> prato;

    Prato(String nome){
        assert nome.length()>0;
        
        this.nome = nome;
        this.prato = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public ArrayList<Alimento> getAlimentos(){
        return prato;
    }

    @Override
    public String toString(){
        return String.format(nome, prato)
    }


    
}
