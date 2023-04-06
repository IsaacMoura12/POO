package Aula08;

public class Veiculo implements KmPercorridosInterface, Comparable<Veiculo> {
    protected String matricula;
    protected String marca;
    protected int potencia;
    protected int quadrokm;
    protected String modelo;
    protected int distancia;
    protected int ultimoTrajeto;


    Veiculo(String matricula, String marca,String modelo, int potencia, int quadrokm){
        assert marca.length()>0;
        assert modelo.length()>0;
        assert potencia >0;
        assert matricula.length()>0;
        assert quadrokm>=0;
        this.quadrokm = quadrokm;
        this.marca = marca;
        this.matricula = matricula;
        this.potencia = potencia;
        this.modelo=modelo;
        this.ultimoTrajeto = 0;
        this.distancia = 0;

    }

    @Override
    public void trajeto(int kilometros){
        assert kilometros>0;
        this.ultimoTrajeto = kilometros;
        this.distancia = this.distancia + kilometros;
        setKms(kilometros);    

    }

    @Override
    public int ultimoTrajeto(){
        return ultimoTrajeto;
    }

    @Override
    public int distanciaTotal(){
        return distancia;
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

    public void setKms(int km){
        quadrokm = quadrokm + km;
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

    @Override
    public int compareTo(Veiculo other) {
    return Integer.compare(other.potencia, this.potencia);
}



    
}
