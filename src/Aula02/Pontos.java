package Aula02;

import java.util.Scanner;

public class Pontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1:");
        double x1 = sc.nextDouble();
        System.out.print("y1:");
        double y1 = sc.nextDouble();
        System.out.print("x2:");
        double x2 = sc.nextDouble();
        System.out.print("y1:");
        double y2 = sc.nextDouble();

        double tmp1 = Math.pow(x2-x1,2);
        double tmp2 = Math.pow(y2-y1,2);
        double distancia = Math.sqrt(tmp1 + tmp2);
        System.out.printf("Distância:" + "%.2f", distancia);
        System.out.println();
        sc.close();




    }
    
}
