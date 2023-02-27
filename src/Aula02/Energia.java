package Aula02;

import java.util.Scanner;



public class Energia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de água (KG): ");
        final double M = sc.nextDouble();
        System.out.print("Insira a temperatura inicial da água (CELSIUS): ");
        final double TEMPI = sc.nextDouble();
        System.out.print("Insira a temperatura final da água (CELSIUS) :");
        final double TEMPF = sc.nextDouble();
        double energy = M * (TEMPF-TEMPI) * 4184;
        System.out.print("Energia (J) : ");
        System.out.printf("%.2f", energy);
        sc.close();






    }
}
