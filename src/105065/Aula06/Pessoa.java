package Aula06;

import Aula05.DateYMD;
import utils.User_input;

public class Pessoa {

    private String nome;
    private int cc;
    private DateYMD dataNasc;


     public Pessoa(String nome, int cc, DateYMD dataNasc){
        
        assert User_input.countDigits(nome) ==0 : "Nome Invalido!";
        assert nome.length() >0;
        this.nome = nome;
        assert cc > 0 : "CC não pode ser negativo ou zero!";
        this.cc = cc;

        this.dataNasc = dataNasc;
    }


    public String getNome(){
        return nome;
    }

    public int getCC(){
        return cc;
    }

    public DateYMD getDatenasc(){
        return dataNasc;
    }

    @Override
    public String toString(){
        return String.format("%s; CC: %d; Data de Nascimento: %s", nome,cc,dataNasc);
    }



    
}
