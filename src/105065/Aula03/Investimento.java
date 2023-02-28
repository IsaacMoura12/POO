package Aula03;
import utils.*;


public class Investimento {
    public static void main(String[] args) {
        double montante = User_input.input_mul("Montante (positivo e múltiplo de 1000):", 0, 1000);
        double juro = User_input.input_interval(" Juro ( entre 0 e 5 %):", 0, 5)/100;

        for (int i = 1; i <= 12; i++) {
            double tmp = montante * juro;
            montante = tmp + montante;
            System.out.print("Valor no mes " + i + " ");
            System.out.printf("%.2f", montante);
            System.out.println();
            
        }
    }
    
}
