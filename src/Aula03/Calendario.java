package Aula03;
import Util.*;

public class Calendario {
    public static void main(String[] args) {
        String [] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        // input com validação:
        int mes = Utils.input_interval_int("Mês: ", 1, 12);
        int ano = Utils.readInt("Ano: ");
        int dia = Utils.input_interval_int("Mês começa no dia da semana: ", 1, 7);

        int diasMes = diasMes(mes,ano);

        System.out.println("\n");

        // print do calendario:
        String header = meses[mes-1] + " " + ano;
        for (int i = 0; i < (20-header.length()/2); i++) {
            System.out.print(" ");
 
        }
        System.out.println(header);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < (dia-1); i++) 
            System.out.print("   ");
            
            int x = dia-1;

            
            for (int j = 1; j <= diasMes; j++) {
                System.out.printf("%2d ", j);
                x = x +1;
                if (x >= 7){
                    x = 0;
                    System.out.println();
                }
                
            }
            System.out.println("\n");
        
        
    }



    // funlao que devolve os dias no mes
    public static int diasMes (int mes, int ano){
        int[] dias = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        if(mes == 2 && ((ano % 400 == 0)) || ((ano %4 == 0) && (ano% 100 != 0))){
            return 29;
        } else {
            return dias[mes];
        }
        
    }
    
}
