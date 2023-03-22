package Aula06;

import Aula05.DateYMD;

public class Bolseiro extends Aluno{
private Professor orientador;
private int bolsa;


public Bolseiro(String nome, int cc, DateYMD dataNasc,DateYMD dataInsc,Professor orientador, int bolsa){
    super(nome,cc,dataNasc,dataInsc);

    assert bolsa>0;
    this.bolsa = bolsa;

    assert orientador instanceof Professor;
    this.orientador = orientador;  
}


public int getBolsa(){
    return bolsa;
}

public Professor getOrientador(){
    return orientador;
}

public  void setBolsa(int valor){
    bolsa = valor;
}

@Override
public String toString(){
    return String.format("%s; Orientador: %s Bolsa: %d", super.toString(), orientador,bolsa);
}

    
}
