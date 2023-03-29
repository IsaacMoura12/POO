package Aula07;
import java.util.Random;

public class Team {
    protected String nome;
    protected String captain;
    protected int totalGoals;
    protected int concededGoals;
    protected Robot[] players;


    Team(String nome, String captain, int totalGoals, int concededGoals, Robot[] players){
        assert nome.length()>0;
        this.nome = nome;
        assert captain.length()>0;
        this.captain = captain;
        assert totalGoals>=0;
        this.totalGoals = totalGoals;
        assert concededGoals>=0;
        this.concededGoals = concededGoals;
        assert players.length >= 1;
        this.players = players;

    }



    public String getName(){
        return nome;
    }

    public String getCaptain(){
        return captain;
    }

    public int getTotalGoals(){
        return totalGoals;
    }


    public int getConcededGoals(){
        return concededGoals;
    }

    public Robot[] getTeam(){
        return players;
    }

    public int getTeamSize(){
        return players.length;
    }

    public double attack(Robot player){
        // devolve uma chance de marcar!
        double chance;
        double multiplier;
        Random generator = new Random();
        if(player.type.equals("Goalkeeper")){
            multiplier = 0.51;

        }else if (player.type.equals("Defender")){
            multiplier = 0.6;

        }else if(player.type.equals("Midfielder")){
            multiplier = 0.7;

        }else{
            multiplier = 1;
        }

        chance = multiplier * generator.nextDouble();
        // chance entre valores (0 a 1) * (até 1)
        // max chance == 1
        return chance;
    }


    // verificar!
    @Override
    public boolean equals(Object other){
        if(!(other instanceof Team))
        return false;
        Team that = (Team) other;
        return this.nome.equals(that.nome);
    }

    // completar!
    @Override
    public String toString(){
        return  nome;
    }
    
}
