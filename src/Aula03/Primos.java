package Aula03;
import Aula02.Input;


public class Primos {
    public static void main(String[] args) {

    double n = Input.readDouble("Número:");
    double sum = 0;

    for (int i = 1; i < n; i++) {
        if(Primo_input.primo_input(i)== true){
            sum = sum + i;
        }
    }
    System.out.print("Soma dos primos:" + sum);

    }
    
}
