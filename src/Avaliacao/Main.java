package Avaliacao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fighter boxers[] = new Boxer[5];
        Fighter wrestlers[] = new Wrestler[5];        
        int choice = 0;
        do {
            System.out.println("Game menu:");
            System.out.println("1. Generate fighters");
            System.out.println("2. Show all fighters");
            System.out.println("3. Start fight between selected fighters");
            System.out.println("4. Start fight between random fighters");
            System.out.println("5. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // generate fighters
                    
                    for (int i = 0; i < wrestlers.length; i++) {
                        wrestlers[i] = new Wrestler("Wrestler" + i, 100, 0, 0);
                        
                    }

                    for (int i = 0; i < boxers.length; i++) {
                        boxers[i] = new Boxer("Boxer" + i,100,0,0);
                        
                    }
                    break;
                case 2:
                    // show fighters
                    System.out.println("\nBoxers:\n");
                    for (int i = 0; i < boxers.length; i++) {
                        System.out.println(boxers[i]);
                        
                    }
                    System.out.println("\nWrestlers:\n");
                    for (int i = 0; i < wrestlers.length; i++) {
                        System.out.println(wrestlers[i]);
                        
                    }
                    break;
                case 3:
                    //simulate a fight between selected fighters
                    break;
                case 4:
                Fighter boxer1 = boxers[0];
                Fighter boxer2 = boxers[1];

                while(boxer1.getVida()>0 && boxer2.getVida()>0)
                boxer1.attack(boxer2);
                if(boxer2.getVida()<=0){
                    System.out.println("Vencedor:" +boxer1);
                    boxer1.setVitorias(boxer1.getVitorias());
                    boxer2.setDerrotas(boxer2.getDerrotas());
                }
                boxer2.attack(boxer1);
                if(boxer1.getVida()<= 0){
                    System.out.println("Vencedor:" + boxer2);
                    boxer1.setDerrotas(boxer1.getDerrotas());
                    boxer2.setVitorias(boxer2.getVitorias());
                }
                
                    //simulate a fight between random fighters
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Opção não existe!");
                    break;
            }

        } while (choice != 5);

        scanner.close();
    }
}
