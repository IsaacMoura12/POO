package Aula08;

public class Legume extends AlimentoVegetariano {
    protected String nome;
    
    Legume(double proteina, double calorias, double peso, String nome){
        super(proteina, calorias, peso);
        assert nome.length()>0;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString(){
        return String.format("Legume %s %s", nome, super.toString());
    }
    
}
