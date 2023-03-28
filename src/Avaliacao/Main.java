package Avaliacao;
import java.util.Scanner;
import java.util.Random;

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
                    System.out.println("\n");

                    break;
                case 3:

                // check for fighters

                int flag =0;
                for (int i = 0; i < wrestlers.length; i++) {
                    if(wrestlers[i] == null){
                        flag++;
                    }                    
                }
                for (int i = 0; i < boxers.length; i++) {
                    if(boxers[i]==null){
                        flag++;

                    }           
                }

                // fighter selection:
                if(flag==0){
                    System.out.println("\nChoose Fighter1 (0-9):\n");
                    int select = scanner.nextInt();
                    while(select >9 || select<0){
                        System.out.println("\n Invalid Fighter!");
                        System.out.println("\nChoose Fighter1 (0-9):\n");

                        select = scanner.nextInt();
                    }

                    System.out.println("\nChoose Fighter2 (0-9):\n");
                    int select2 = scanner.nextInt();
                    while(select2 >9 || select2<0 || select2==select){
                        if(select2==select){
                            System.out.println("Cannot choose same fighter!");

                        }
                        System.out.println("\n Invalid Fighter!");
                        System.out.println("\nChoose Fighter2 (0-9):\n");

                        select = scanner.nextInt();
                    }

                    // fight:

                    Fighter fighter1, fighter2;
                    if(select<=4){
                         fighter1 = boxers[select];
                    }else{
                         fighter1 = wrestlers[select-5];
                    }
    
                    if(select2<=4){
                         fighter2 = boxers[select2];
                    }else{
                         fighter2 = wrestlers[select2-5];
                    }

                System.out.println("\n Fight Starting!\n");
                System.out.println(fighter1.getNome() + " VS " + fighter2.getNome()+"\n");

                
        
                int damage;
                while(fighter1.isAlive() && fighter2.isAlive())

                fighter1.attack(fighter2);
                damage = 100 - fighter2.getVida();

                System.out.println(fighter1.getNome() + " attacked and dealt " + damage + " damage!");

                if(fighter2.getVida()<=0){
                    System.out.println(fighter2.getNome() + " died!\n");
                    System.out.println("WINNER: " + fighter1.getNome() + "\n");
                    fighter1.setVitorias(fighter1.getVitorias());
                    fighter2.setDerrotas(fighter2.getDerrotas());
                } else {
                    fighter2.attack(fighter1);
                    damage = 100 - fighter1.getVida();
                    System.out.println(fighter2.getNome() + " attacked and dealt " + damage + " damage!");
                    if(fighter1.getVida()<= 0){
                        System.out.println(fighter1.getNome() + " died!\n");
    
                        System.out.println("WINNER: " + fighter2.getNome()+"\n");
                        fighter1.setDerrotas(fighter1.getDerrotas());
                        fighter2.setVitorias(fighter2.getVitorias());
                    }
                }





                } else {
                    System.out.println("There are no generated fighters!\n");
                    break;

                }
                    //simulate a fight between selected fighters
                    break;
                case 4:
                 flag =0;
                for (int i = 0; i < wrestlers.length; i++) {
                    if(wrestlers[i] == null){
                        flag++;
                    }                    
                }
                for (int i = 0; i < boxers.length; i++) {
                    if(boxers[i]==null){
                        flag++;

                    }           
                }

                if(flag == 0){
                    Random generator = new Random();
                int f1 = generator.nextInt(10);
                int f2 = generator.nextInt(10);
                
                while(f1==f2){
                    
                    f2 = generator.nextInt(10);
                }

                Fighter fighter1, fighter2;
                    if(f1<=4){
                         fighter1 = boxers[f1];
                    }else{
                         fighter1 = wrestlers[f1-5];
                    }
    
                    if(f2<=4){
                         fighter2 = boxers[f2];
                    }else{
                         fighter2 = wrestlers[f2-5];
                    }

                
                

                System.out.println("\n Fight Starting!\n");
                System.out.println(fighter1.getNome() + " VS " + fighter2.getNome()+"\n");

                
        
                int damage;
                while(fighter1.isAlive() && fighter2.isAlive())

                fighter1.attack(fighter2);
                damage = 100 - fighter2.getVida();

                System.out.println(fighter1.getNome() + " attacked and dealt " + damage + " damage!");

                if(fighter2.getVida()<=0){
                    System.out.println(fighter2.getNome() + " died!\n");
                    System.out.println("WINNER: " + fighter1.getNome() + "\n");
                    fighter1.setVitorias(fighter1.getVitorias());
                    fighter2.setDerrotas(fighter2.getDerrotas());
                } else {
                    fighter2.attack(fighter1);
                    damage = 100 - fighter1.getVida();
                    System.out.println(fighter2.getNome() + " attacked and dealt " + damage + " damage!");
                    if(fighter1.getVida()<= 0){
                        System.out.println(fighter1.getNome() + " died!\n");
    
                        System.out.println("WINNER: " + fighter2.getNome()+"\n");
                        fighter1.setDerrotas(fighter1.getDerrotas());
                        fighter2.setVitorias(fighter2.getVitorias());
                    }
                }
                } else {
                    System.out.println("There are no generated fighters!\n");
                    break;
                }   
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
