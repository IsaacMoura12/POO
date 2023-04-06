package Aula08;

public class Motociclo extends Veiculo {
    protected enum Tipo {
        desportivo, estrada
    }
    
    protected Tipo tipo;


    Motociclo(String matricula, String marca, String modelo, int potencia, Tipo tipo, int quadrokm){
        super(matricula, marca,modelo, potencia,quadrokm);
        this.tipo = tipo;
    }
  
    public Tipo getTipo(){
        return tipo;
    }

    

    @Override
    public String toString(){
        return "Motociclo - Matricula: " + matricula + " Marca: " + marca + " Potência: " + potencia + " Tipo: " + tipo;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Motociclo))
        return false;
        Motociclo that = (Motociclo) other;
        return this.matricula.equals(that.matricula);

    }



    
}
