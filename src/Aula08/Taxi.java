package Aula08;

public class Taxi extends AutomovelLigeiro {
    protected int licenca;


    Taxi(String matricula, String marca, String modelo, int potencia, int quadrokm, int bagageira, int licenca ){
        super(matricula, marca, modelo, potencia, quadrokm, bagageira);
        assert licenca>=0;
        this.licenca = licenca;
    }

    public int getLicenca(){
        return licenca;
    }



    @Override
    public String toString(){
        return "Taxi - Matricula: " + matricula + " Marca: " + marca + " Modelo " + modelo +  " Potência: " + potencia + " Kms: " + quadrokm + " Bagageira: " + bagageira + " Licença: " + licenca;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Taxi))
        return false;
        Taxi that = (Taxi) other;
        return this.matricula.equals(that.matricula);

    }


    
}
