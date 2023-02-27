package Aula03;


import java.util.Scanner;

public class Alto_baixo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = "Sim";
        while(resposta.equals("Sim") || resposta.equals("S")){
            int valor = 1 + (int)(Math.random() * ((100-1) +1));
            System.out.println("Adivinha o número:");
            System.out.print("Tentativa:");
            int tentativa = sc.nextInt();
            int count = 1;

            if(tentativa > valor){
                System.out.println("Demasiado alto!");
            } else{
                System.out.println("Demasiado baixo!");
            }

            while(tentativa != valor){
                System.out.print("Tentativa:");
                tentativa = sc.nextInt();
                if(tentativa > valor){
                    System.out.println("Demasiado alto!");
                }else{
                    System.out.println("Demasiado baixo!");
                }
                count = count +1;
            }
            if(tentativa == valor){
                System.out.println("Correto! " + count +  " tentativas");
                System.out.print("Pretende continuar? Prima (S)im");
                resposta = sc.next();
            }       
        } 

        
        sc.close();
        
    }
    
}
