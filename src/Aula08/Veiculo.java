package Aula08;

public class Veiculo {
    protected String matricula;
    protected String marca;
    protected int potencia;
    protected int quadrokm;
    protected String modelo;


    Veiculo(String matricula, String marca,String modelo, int potencia, int quadrokm){
        assert marca.length()>0;
        assert modelo.length()>0;
        assert potencia >0;
        assert matricula.length()>0;
        this.marca = marca;
        this.matricula = matricula;
        this.potencia = potencia;
        this.modelo=modelo;
    }



    public String getMatricula(){
        return matricula;
    }

    public String getMarca(){
        return marca;
    }

    public int getPotencia(){
        return potencia;
    }

    public String getModelo(){
        return modelo;
    }
    public int getKms(){
        return quadrokm;
    }


    @Override
    public String toString(){
        return "Veiculo - Matricula: " + matricula + " Marca: " + marca + " Modelo " + modelo +  " Potência: " + potencia + " Kms: " + quadrokm;

    }

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Veiculo))
        return false;
        Veiculo that = (Veiculo) other;
        return this.matricula.equals(that.matricula);

    }



    
}
