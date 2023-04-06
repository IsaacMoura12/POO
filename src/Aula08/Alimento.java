package Aula08;

public abstract class Alimento {
    protected double proteina;
    protected double calorias;
    protected double peso;


    Alimento(double proteina, double calorias, double peso){
        assert proteina >=0;
        assert calorias >=0;
        assert peso>0;
        this.proteina = proteina;
        this.calorias = calorias;
        this.peso = peso;

    }


    public double getProteina(){
        return proteina;
    }


    public double getCalorias() {
        return calorias;
        
    }

    public double getPeso(){
        return peso;
    }


    @Override
    public String toString(){
        return String.format("Proteínas %.1f, Calorias %1.f, Peso %1.f", proteina, calorias, peso);
    }
    
}
