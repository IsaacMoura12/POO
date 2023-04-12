package Aula08;

public abstract class AlimentoVegetariano extends Alimento {

    
    protected  boolean vegetariano = true;


    AlimentoVegetariano(double proteina, double calorias, double peso){
        super(proteina, calorias, peso);

    }
    
    public boolean getVeg(){
        return vegetariano;
    }

    @Override
    public String toString(){
        return String.format("Proteínas %.1f, Calorias %.1f, Peso %.1f", proteina, calorias, peso);
    }
    
    
}
