package Aula12;

import java.io.IOException;

public class BlockbusterTester {
    public static void main(String[] args) throws IOException {

        Blockbuster blockbuster = new Blockbuster();
        
        blockbuster.LoadMovies("src/Aula12/movies.txt");
        System.out.println();
        System.out.println("Movie Catalog:");
        blockbuster.ListMovies();
        System.out.println();
        System.out.println("Movies Ranked by Score:");
        blockbuster.ListMoviesByScore();
        System.out.println();
        System.out.println("Movies Ranked by Running Time:");
        blockbuster.ListMoviesByTime();
        System.out.println();
        blockbuster.BestMoviesReport("src/Aula12/myselection.txt", "action", 60);
        
    }
    
}
