package Aula10;


import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class StringAnalizer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Insert String:");
        String str = sc.nextLine();

        while(str.length()==0){
            System.out.println("Insert String:");
            str = sc.nextLine();
        }

        
        char[] chars = str.toCharArray();
        Map<Character, List<Integer>> charPositions = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!charPositions.containsKey(c)) {
                charPositions.put(c, new ArrayList<>());
            }
            charPositions.get(c).add(i);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : charPositions.keySet()) {
            List<Integer> positions = charPositions.get(c);
            sb.append(c).append('=').append(positions).append(", ");
        }
        String result = "{" + sb.toString().substring(0, sb.length() - 2) + "}";
        System.out.println(result);


        sc.close();
        
    }
    
}
