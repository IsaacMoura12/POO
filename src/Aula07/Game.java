package Aula07;

public class Game {
    protected Team team1;
    protected Team team2;
    protected Ball ball;
    protected int duration;
    protected int time;
    

    Game(Team team1,  Team team2, Ball ball, int duration, int time){
        assert team1.getTeamSize() >=1;
        assert team2.getTeamSize() >= 1;
        assert !(team1.equals(team2));
        this.team1 = team1;
        this.team2 = team2;
        this.ball = ball;
        assert duration >0;
        this.duration = duration;
        assert time >=0;
        this.time = time;

    }


    public Team getTeam1(){
        return team1;
    }

    public Team getTeam2(){
        return team2;
    }

    public Ball getBall(){
        return ball;
    }


    public int getDuration(){
        return duration;
    }

    public int getTime(){
        return time;
    }

    public void elapsedTime(){
        
        time++;

    }


    // Acabar!
    @Override
    public String toString(){
        return "Game between " + team1 + " and " + team2;
    }
}
