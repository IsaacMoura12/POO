package Aula02;

import java.util.Scanner;

public class Graus_C_to_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insere a temperatura em graus celsius: ");
        final double temp_c = sc.nextDouble();
        final double temp_f = temp_c *1.8 + 32;
        System.out.println("A temperatura em Fahreneit é:");
        System.out.printf("%.2f", temp_f);
        System.out.println("");
        sc.close();


    }
}
