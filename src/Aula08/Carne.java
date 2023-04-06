package Aula08;

public class Carne extends AlimentoNormal{
    protected enum Variedade {
        vaca, porco, peru, frango, outra
    }
    protected Variedade variedade;

    Carne(double proteina, double calorias, double peso, Variedade variedade){
        super(proteina, calorias, peso);
        this.variedade = variedade;
    }


    public Variedade getVariedade(){
        return variedade;
    }

    @Override
    public String toString(){
        return String.format("Carne %s, %s", variedade, super.toString());
    }

    
}
