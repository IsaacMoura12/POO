package Aula08;

import java.util.ArrayList;
import java.util.List;

public class Ementa{
    protected String nome;
    protected String local;
    protected List<Prato> ementa;


    Ementa(String nome, String local){
        assert nome.length()>0;
        assert local.length()>0;
        this.nome = nome;
        this.local = local;

        ementa = new ArrayList<>();
    }

    public void addPrato(Prato prato, int i){
        ementa.add(i, prato);
    }

    public String getNome(){
        return nome;
    }

    public String getLocal(){
        return local;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nEmenta" + nome + ", " + local);
        for (Prato prato : ementa){
            sb.append(prato + "\n");
        }
        return sb.toString();
    }

    
}
