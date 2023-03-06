package Aula03;
import utils.*;

public class Extra_Strings {
    public static void main(String[] args) {
       String  s = User_input.input_str("Insere uma String:");
       String new_s = s.toUpperCase();
       System.out.println("String em maiúsculas: " + new_s);
       char last = s.charAt(s.length()-1);
       System.out.println("Último caractere: " + last);
       char s0 = s.charAt(0);
       char s1 = s.charAt(1);
       char s2 = s.charAt(2);
       System.out.println(s0 + "," + s1 + "," + s2);
       int point = s.codePointAt(0);
       System.out.println("Código do primeiro caracter (UNICODE): " + point);

        
    }
    
}
