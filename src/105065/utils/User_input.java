package utils;
import java.util.Scanner;

public class User_input {


    // validações testadas por verdade (se condição se verifica sai do ciclo)
        private static Scanner sc = new Scanner(System.in);

        // read double:
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

        public static int readInt(String msg){
            int v;
            while(true) {
                System.out.print(msg);
                v = Integer.parseInt(sc.nextLine());
                if (v > 0) break;
                System.err.println("TEM DE SER POSITIVO!");
            }
            return v;
        }

    
    // input intervalo
    public static double input_interval(String msg, double min, double max) {
        double v;
        while(true){
            System.out.print(msg);
            v = Double.parseDouble(sc.nextLine());
            if ( v >= min && v <= max) break;
            System.err.println("TEM DE ESTAR NO INTERVALO!!");

        }
        return v;
    }


    public static int input_interval_int(String msg, int min, int max) {
        int v;
        while(true){
            System.out.print(msg);
            v = Integer.parseInt(sc.nextLine());
            if ( v >= min && v <= max) break;
            System.err.println("TEM DE ESTAR NO INTERVALO!!");

        }
        return v;
    }

    // input min com multiplo
    public static double input_mul(String msg, double min, double mul) {
        double v;
        
        while(true){
            System.out.print(msg);
            v = Double.parseDouble(sc.nextLine());
            if(v%mul==0 && v >0)break; 
            System.err.println("TEM DE SER MÚLTIPLO DE:" + mul);
        
        }
        return v;
    }

}
