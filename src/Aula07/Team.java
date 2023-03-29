package Aula07;

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
