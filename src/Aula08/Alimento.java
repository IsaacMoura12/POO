package Aula08;

public abstract class Alimento {
    protected double proteina;
    protected double calorias;
    protected double peso;
    protected boolean vegetariano;


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

    public boolean getVeg(){
        return vegetariano;
    }


    @Override
    public String toString(){
        return String.format("Proteínas %.1f, Calorias %.1f, Peso %.1f", proteina, calorias, peso);
    }
    
}
