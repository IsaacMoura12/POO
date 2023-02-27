package Aula03;
import Util.*;

public class Notas {
    public static void main(String[] args) {


        int alunos = Utils.readInt("Insira número de alunos na turma: ");
        double turma[][] = new double [alunos][alunos];
        double notasf[] = new double [alunos];
        double nota_f;

        for (int i = 0; i < alunos; i++) {
            double nota_t = Utils.input_interval("Insira nota teórica (0-20): ", 0, 20);
            double nota_p = Utils.input_interval("Insira nota prática ", 0, 20);
            if( nota_t < 7 || nota_p < 7){
                nota_f = 66;
            }else{
                nota_f = (nota_t * 0.4) + (nota_p * 0.6);
            }


            turma[i][0] = nota_t;
            turma[i][1] = nota_p;
            notasf[i] = nota_f;

        }
        System.out.println("Nota T  Nota P  Nota F");;
        for (int i = 0; i < turma.length; i++) {
            
           System.out.printf("%.2f", turma[i][0]);
           System.out.print("    ");
           System.out.printf("%.2f",turma[i][1]);
           System.out.print("    ");
           System.out.printf("%.2f",notasf[i]);
           System.out.println();
        
          }    
        }
    }
    

