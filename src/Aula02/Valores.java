package Aula02;

import java.util.Scanner;
public class Valores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insere valores para calcular media, acaba com o primeiro inserido.");
        int primeiro = scan.nextInt();
        System.out.print("Insere valor:");
        int valor = scan.nextInt();
        int soma = valor + primeiro;
        int count = 2;
        int max,min;

        if(primeiro >= valor){
             max = primeiro;
             min = valor;
        }else{
            max = valor;
            min = max;}


        
        
        while(valor != primeiro){
            System.out.print("Insere valor:");
            valor = scan.nextInt();
            soma = soma + valor;
            count = count +1;
            if(valor>= max){
                max = valor;
            }

            if(valor < min){
                min = valor;
            }

        }


        int media = soma/count;

        System.out.println("Valor máximo: " + max);
        System.out.println("Valor minimo: " + min);
        System.out.println("Valores inseridos: " + count);
        System.out.println("Média: " + media);





        scan.close();
    }
    
}
