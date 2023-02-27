package Aula02;


public class Velocidade {
    public static void main(String[] args) {
        double v1, v2, d1, d2;
        v1 = Input.readDouble("Velocidade1?");
        v2 = Input.readDouble("Velocidade2?");
        d1 = Input.readDouble("Distância1?");
        d2 = Input.readDouble("Distância2?");
        double temp1 = d1/v1;
        double temp2 = d2/v2;
        double temp = temp1 + temp2;
        double dtotal = d1 +d2;
        double vmedia = dtotal/temp;
        System.out.print("Velocidade média final : ");
        System.out.printf("%.2f", vmedia);
        System.out.println("");



    }
    
}
