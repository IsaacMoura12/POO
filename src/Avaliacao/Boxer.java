package Avaliacao;
import java.util.Random;

public class Boxer extends Fighter {
    protected int range;      // valor aleatoria entre 1 e 10


      Boxer(String nome, int vida, int vitorias, int derrotas){
        super(nome,vida,vitorias,derrotas);
        assert range >=1 && range<=10;
        Random generator = new Random();
        this.range = generator.nextInt(11);  // int aleatorio entre 0 e 1

    }

    public int getRange(){
        return range;
    }


    public void attack(Fighter other){
        Random generator = new Random();
        int distance = generator.nextInt(11);  // int aleatorio entre 0-10
        if(distance < this.range){
            int damage = generator.nextInt(99) +1;
            other.setVida(damage);
        }



    }

    @Override
    public String toString(){
        return "Wrestler " + getNome() + " with range " + range + ": (" + getVitorias()+ "W / " + getDerrotas() + "L)";

    }

    

    @Override
    public boolean equals(Object other){
        if(!(other instanceof Boxer))
        return false;
        Boxer that = (Boxer) other;
        return this.getNome().equals(that.getNome());

    }

    
}
