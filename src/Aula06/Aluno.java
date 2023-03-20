package Aula06;

import Aula05.*;

public class Aluno extends Pessoa {
    private static int nMecIterator = 100;
    private int nmec;
    private DateYMD dataInsc;


    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD dataInsc){
        super(nome,cc,dataNasc);
        this.nmec = nMecIterator++;
        this.dataInsc = dataInsc;

    }

     public Aluno(String nome, int cc, DateYMD dataNasc){
        super(nome,cc,dataNasc);
        this.nmec = nMecIterator++;
        this.dataInsc = new DateYMD(20,3,2023);
    }

    public int getNmec(){
        return nmec;
    }


    public DateYMD getDataInsc(){
        return dataInsc;
    }


    @Override
    public String toString(){
        return String.format("%s; Nmec: %d; inscDate: %s", super.toString(), nmec,dataInsc);
    }
    
}
