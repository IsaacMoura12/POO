package Aula03;
import utils.*;

public class Extra_String_Operations {
    
    public static void main(String[] args) {
        String s = User_input.input_str("Introduz uma String: ");
        System.out.println("String só contém maiúsculas : " + User_input.is_allUpper(s));
        System.out.println("String só contém minúsculas : " + User_input.is_allLower(s));
        System.out.println("Nº digitos na String: " + User_input.countDigits(s));
        System.out.println("Nº espaços na String: " + User_input.countSpaces(s));
        System.out.println("String após remoção de espaços: " + User_input.removeSpaces(s));
        System.out.println("String é um palíndromo: " + User_input.isPalindrome(s));
        System.out.println("Acrónimo: " + User_input.toAcronym(s));
    }
}
