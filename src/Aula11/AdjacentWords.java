package Aula11;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.io.File;
import java.io.IOException;

public class AdjacentWords {
    public static void main(String[] args) throws IOException {
        String separators = "[\\s.,:'‘’;?!-*{}=+&/()”“\"\']+"; // split by whitespace or punctuation
        Map<String, TreeMap<String, Integer>> adjacentWords = new TreeMap<>();

        try (Scanner scanner = new Scanner(new File("major.txt"))) {
            scanner.useDelimiter(separators);

            String previousWord = "";
            while (scanner.hasNext()) {
                String currentWord = scanner.next();
                currentWord = currentWord.toLowerCase();

                if (currentWord.length() >= 3) {
                    adjacentWords.putIfAbsent(previousWord, new TreeMap<>());
                    adjacentWords.get(previousWord).merge(currentWord, 1, Integer::sum);
                    System.out.printf("%s %s \n", previousWord, currentWord);

                    previousWord = currentWord;
                }
            }
        }

        for (String word : adjacentWords.keySet()) {
            TreeMap<String, Integer> followingWords = adjacentWords.get(word);
            System.out.print(word + ": {");
            boolean isFirst = true;
            for (Map.Entry<String, Integer> entry : followingWords.entrySet()) {
                String followingWord = entry.getKey();
                int count = entry.getValue();
                if (isFirst) {
                    System.out.print(followingWord + "=" + count);
                    isFirst = false;
                } else {
                    System.out.print(", " + followingWord + "=" + count);
                }
            }
            System.out.println("}");
        }
    }
}