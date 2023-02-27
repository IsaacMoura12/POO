package Aula02;

import java.util.Scanner;

public class MilhasKm {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Insira distância em km:");
            final int km = sc.nextInt();
            final double milhas = (km/1.609);
            System.out.printf("A distancia em milhas é : " + "%.2f ", milhas);
            sc.close();

        }
    
}
