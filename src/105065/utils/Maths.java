package utils;

public class Maths {

    // verifica se numero é primo
    public static boolean is_primo(double n) {
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
