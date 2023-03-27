package Avaliacao;

import java.util.Random;

public class Wrestler extends Fighter{
    protected int speed;


        Wrestler(String nome, int vida, int vitorias, int derrotas){
            super(nome,vida,vitorias,derrotas);
            assert speed >=1 && speed<=10;
            Random generator = new Random();
            this.speed = generator.nextInt(11);
        }


        public int getSpeed(){
            return speed;
        }

        public void attack(Fighter other){
            Random generator = new Random();
            int distance = generator.nextInt(11);
            if(this.speed > distance){
                int damage = generator.nextInt(99) + 1;
                other.setVida(damage);

            }


        }

        @Override
        public String toString(){
        return "Fighter " + getNome() + " do tipo Wrestler tem " + getVitorias() +  " e " + getDerrotas() +  " derrotas e velocidade " + speed;

    }

        @Override
        public boolean equals(Object other){
        if(!(other instanceof Wrestler))
        return false;
        Wrestler that = (Wrestler) other;
        return this.getNome().equals(that.getNome());

    }


    
}
