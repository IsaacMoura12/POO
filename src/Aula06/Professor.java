package Aula06;


import Aula05.*;

public class Professor extends Pessoa{

    private String categoria;
    private String dep;

    Professor(String nome, int cc, DateYMD dataNasc, String categoria,String dep){
        super(nome, cc, dataNasc);

        assert dep.length() > 0;
        this.dep = dep;

        assert categoria.length()>0;
        this.categoria = categoria;

    }

    public String getDep(){
        return dep;
    }

    public String getCategoria(){
        return categoria;

    }


    @Override
    public String toString(){
        return String.format("%s; Categoria: %s; Departamento: %s", super.toString(), categoria,dep);
    }


    
}
