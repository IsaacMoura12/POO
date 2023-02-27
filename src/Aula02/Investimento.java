package Aula02;

import java.util.Scanner;

public class Investimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor do investimento inicial:");
        double MONTANTE = sc.nextDouble();
        System.out.print("Insira a taxa de juro mensal (%): ");
        final double JURO = sc.nextDouble()/100;
        System.out.println("Indique o período de tempo em meses: ");
        final int MESES = sc.nextInt();

        double valor = MONTANTE;
        double tmp = 0;

        for (int i = 1; i<=MESES;i++){
            tmp = valor * JURO;
            valor = valor + tmp;
        }
        System.out.printf("Montante final ao fim de  " + MESES + " meses : " + "%.2f", valor);
        System.out.println("");
        


        sc.close();



    }
    
}
