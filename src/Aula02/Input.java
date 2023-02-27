package Aula02;

import java.util.Scanner;

public class Input {
 
        private static Scanner sc = new Scanner(System.in);
        public static double readDouble(String msg){
            double v;
            while(true) {
                System.out.print(msg);
                v = Double.parseDouble(sc.nextLine());
                if (v > 0) break;
                System.err.println("TEM DE SER POSITIVO!");


            }
            return v;
        }
    }
