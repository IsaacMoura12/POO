package Aula03;
import Util.*;


public class Investimento {
    public static void main(String[] args) {
        double montante = Utils.input_mul("Montante (positivo e múltiplo de 1000):", 0, 1000);
        double juro = Utils.input_interval(" Juro ( entre 0 e 5 %):", 0, 5)/100;

        for (int i = 1; i <= 12; i++) {
            double tmp = montante * juro;
            montante = tmp + montante;
            System.out.print("Valor no mes " + i + " ");
            System.out.printf("%.2f", montante);
            System.out.println();
            
        }
    }
    
}
