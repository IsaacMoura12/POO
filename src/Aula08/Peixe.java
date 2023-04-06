package Aula08;

public class Peixe extends AlimentoNormal {
    protected enum Tipo{
        congelado, fresco

    }
    protected Tipo tipo;


    Peixe(double proteina, double calorias, double peso, Tipo tipo){
        super(proteina, calorias, peso);
        this.tipo = tipo;
    }

    public Tipo getTipo(){
        return tipo;
    }


    @Override
    public String toString(){
        return String.format("Peixe %s %s", tipo, super.toString());

    }
    
}
