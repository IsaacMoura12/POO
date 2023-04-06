package Aula08;

public class Cereal extends AlimentoVegetariano {
    protected String nome;
    
    Cereal(double proteina, double calorias, double peso, String nome){
        super(proteina, calorias, peso);
        assert nome.length()>0;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString(){
        return String.format("Cereal %s %s", nome, super.toString());
    }
    
}
