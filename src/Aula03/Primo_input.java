package Aula03;

public class Primo_input {
    public static boolean primo_input(double n) {
        double sum =0;
        double tmp;
        double tmp2 = n;
        while(tmp2>0){
            tmp = n % tmp2;
            if(tmp ==0){
                sum = sum+1;
            }
            tmp2 = tmp2 -1;
        }
        if (sum == 2){
            return true;
        }
        return false;
    }
}
