package Aula12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Blockbuster {
    private Map<String, Movie> movies;
    
    Blockbuster(){
        movies = new TreeMap<>();
    }

    public void LoadMovies(String file){
        try(Scanner sc = new Scanner(new File(file))){
            sc.nextLine(); // skip header

            String line = sc.nextLine();
            String [] data = line.split("\t");
            String name = data[0];
            double score = Double.parseDouble(data[1]);
            String genre = data[2];
            int time = Integer.parseInt(data[3]);

            Movie movie = new Movie(name, score, genre, time);
            movies.put(name, movie);

        }catch (FileNotFoundException e){
            System.out.println("File not Found" + e.getMessage());

        }
    }

    public void ListMovies(){
        for(Map.Entry<String, Movie> entry : movies.entrySet()){
            String name = entry.getKey();
            Movie movie = entry.getValue();
            System.out.println(name + " - " + movie.getGenre() + " - " + movie.getTime() + "min - Score: " + movie.getScore());
        }
    }

    public void ListMoviesByScore() {
    TreeMap<Double, Movie> sortedMovies = new TreeMap<>(java.util.Collections.reverseOrder());

    for (Map.Entry<String, Movie> entry : movies.entrySet()) {
        Movie movie = entry.getValue();
        sortedMovies.put(movie.getScore(), movie);
    }

    System.out.println("Movies by Score:");
    for (Map.Entry<Double, Movie> entry : sortedMovies.entrySet()) {
        Movie movie = entry.getValue();
        System.out.printf("%s (Score: %.1f)%n", movie.getName(), movie.getScore());
    }
}


public void ListMoviesByTime() {
    List<Movie> movieList = new ArrayList<>(movies.values());
    Collections.sort(movieList, Comparator.comparingInt(Movie::getTime));
    for (Movie movie : movieList) {
        System.out.println(movie);
    }
}

public Map<String, Movie> findMoviesByGenreAndScore(String genre, int minScore) {
    Map<String, Movie> matchingMovies = new TreeMap<>();
    for (Map.Entry<String, Movie> entry : movies.entrySet()) {
        Movie movie = entry.getValue();
        if (movie.getGenre().equalsIgnoreCase(genre) && movie.getScore() >= minScore) {
            matchingMovies.put(entry.getKey(), movie);
        }
    }
    return matchingMovies;
}

public void BestMoviesReport(String file, String genre, int score){
    Map<String,Movie> report = findMoviesByGenreAndScore(genre, score);
    try{
        PrintWriter pw = new PrintWriter(new FileWriter(file));
        pw.println(String.format("%\ts %\tf %\ts %\tf", "Name", "Score", "Genre", "Running Time"));

        for (Map.Entry<String,Movie> entry : report.entrySet()){
            Movie movie = entry.getValue();
            String name = movie.getName();
            double scores = movie.getScore();
            String genres = movie.getGenre();
            int time = movie.getTime();
            pw.println(genres);
        }

        

        pw.close();
        System.out.println("Report written to file: " + file);
    } catch (IOException e){
        System.out.println("Error writing report to file: " + file);
        e.printStackTrace();
    }

}


    
}
