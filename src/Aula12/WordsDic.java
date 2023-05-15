package Aula12;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WordsDic {
    public static void main(String[] args) throws IOException {

        Map<Character, Map<String, Integer>> words = new TreeMap<>();

        try(Scanner sc = new Scanner(new File("src/Aula12/A_cidade_e_as_serras.txt"))){
            sc.useDelimiter("[\\s.,:'‘’;?!-*{}»«=+&/()”“\"\']+");
            while(sc.hasNext()){
                String word = sc.next();
                word = word.toLowerCase();

                if(word.length()>=3){
                    char inicial = word.charAt(0);
                    if(Character.isLetter(inicial)){
                        if(!(words.containsKey(inicial))){
                            words.put(inicial, new TreeMap<>());
    
                        }
                        Map<String, Integer> wordCounts = words.get(inicial);
    
                        if (!wordCounts.containsKey(word)) {
                            wordCounts.put(word, 1);
                        } else {
                            wordCounts.put(word, wordCounts.get(word) + 1);
                        }

                    }
                   
                }
            }

        }

        File file = new File("src/Aula12/Eça.txt");
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(file));
            for(Map.Entry<Character, Map<String, Integer>> entry : words.entrySet()){
                char initial = entry.getKey();
                Map<String, Integer> wordCount = entry.getValue();
                pw.println(initial + ":" + wordCount);
                
            }
            pw.close();

            System.out.println("Report written in file " + file);
        } catch(IOException e){
            System.out.println("Error writing report to file: " + file);
            e.printStackTrace();
        }
    }
    
}
