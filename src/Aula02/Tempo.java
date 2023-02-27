package Aula02;

public class Tempo {
    public static void main(String[] args) {
        double s;
        s = Input.readDouble("Segundos?");
        double h = s/3600;
        double m = (s/60) % 60;
        double s1 = (s/60)/60;
        System.out.printf("%.1f",h,m,s1);

        System.out.print(h + ":" + m + ":" + s1);
        


    }
    
}
