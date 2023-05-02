package Aula10;

import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;




public class FileText {
    public static void main(String[] args) throws IOException{
        
        Scanner input  = new Scanner(new FileReader("Aula10.words.txt"));

        while(input.hasNext()){
            String word = input.next();
            System.out.println(word);
        }
    }
    
}
