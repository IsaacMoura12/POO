package Aula12;

public class Movie {
    protected String name;
    protected double score;
    protected String genre;
    protected int time;

    Movie(String name, double score, String genre, int time){

        assert name.length()>0;
        assert genre.length()>0;
        assert score >=0;
        assert time >0;
        this.name = name;
        this.score = score;
        this.genre = genre;
        this.time = time;
    }

    public String getName(){
        return name;
    }

    public String getGenre(){
        return genre;
    }

    public double getScore(){
        return score;
    }

    public int getTime(){
        return time;
    }

    @Override
    public String toString(){
        return this.name + ": Score: " + this.score + " | Genre: " + this.genre + " | Running Time: " + this.time; 

    }
    
}
