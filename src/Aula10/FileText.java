package Aula10;

import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;




public class FileText {
    public static void main(String[] args) throws IOException{
        
        
        Scanner input  = new Scanner(new FileReader("words.txt"));
        List<String> text = new ArrayList<>();

        PrintText(input, text);


        System.out.println();
        System.out.println("Words ending in s:");
        WordsEndingIn('s', text);

        System.out.println();
        System.out.println("Words that only have letters:");
        RemoveNonLetterWords(text);
      
        
    }


    public static void PrintText(Scanner sc, List<String> txt){
        while(sc.hasNext()){
            String str = sc.next();
            if(str.length()>=2){
                txt.add(str);
            }
            System.out.println(str);
            

        }
    }

    public static void WordsEndingIn(char c, List<String> txt){
        for(String str : txt){
            if(str.charAt(str.length()-1) == c ){
                System.out.println(str);
            }    
        }
    }

    public static void RemoveNonLetterWords(List<String> txt){
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");

        for (int i = txt.size()-1; i >=0 ;i--) {
            String word = txt.get(i);
            if(!pattern.matcher(word).matches()){
                txt.remove(i);
            }
        }
        for(String str : txt){
            System.out.println(str);
        }
    }



    
}
