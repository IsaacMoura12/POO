package Aula12;

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WordCounter {

    public static void main(String[] args) throws IOException {
        
        Map<String, Integer> words = new TreeMap<>();



        try(Scanner sc = new Scanner(new File("src/Aula12/words.txt"))){
            sc.useDelimiter(" ");
            while(sc.hasNext()){
                String word = sc.next();
                


                if(word.length()>=3){
                    words.put(word,words.getOrDefault(word, 0)+1);
                }
            }
        }

        int totalWords = 0;
        for (int count : words.values()) {
                totalWords += count;
        }

        System.out.println("Número Total de palavras: " + totalWords);
        System.out.println("Número de palavras únicas: " + words.size());

    }    
}
