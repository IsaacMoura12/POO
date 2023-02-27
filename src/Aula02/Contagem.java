package Aula02;

import java.util.Scanner;
public class Contagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza um numero para iniciar a contagem decrescente:");
        int numero = sc.nextInt();

        while(numero >=0){
            System.out.println(numero);
            numero = numero -1;
        }

       sc.close(); 
    }
}
