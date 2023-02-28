package Aula03;
import Aula02.Input;
import utils.*;


public class Primos {
    public static void main(String[] args) {

    double n = Input.readDouble("Número:");
    double sum = 0;

    for (int i = 1; i < n; i++) {
        if(Maths.is_primo(i)== true){
            sum = sum + i;
        }
    }
    System.out.print("Soma dos primos:" + sum);
    System.out.println("\n");

    }
    
}
