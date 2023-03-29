package Aula07;
import java.util.Random;
import java.util.Scanner;

// Area de jogo


public class GameTester {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // inicializações
        String[] positions = {"Goalkeeper", "Defender", "Center-Back", "Striker"};
        Random generator = new Random();
        int lowerbound = -25;
        int upperbound = 25;
        Robot[] robots2 = new Robot[5];
        Robot[] robots1 = new Robot[5];
        Team team1 = new Team(null, null, lowerbound, upperbound, robots1);
        Team team2 = new Team(null, null, lowerbound, upperbound, robots1);

        int choice = 0;
        while(true){
            System.out.println("Game Menu:");
            System.out.println("1. Generate Teams");
            System.out.println("2. Play Game");
            System.out.println("5. Exit");

            choice = sc.nextInt();


            if(choice==1){

                robots1[0] = new Robot(generator.nextInt(upperbound - lowerbound+ 1) + lowerbound, generator.nextInt(upperbound - lowerbound+ 1) + lowerbound, 0, "Jogador" + 0, positions[0], 0);
        for (int i = 1; i < robots1.length; i++) {
            robots1[i] = new Robot(generator.nextInt(upperbound - lowerbound+ 1) + lowerbound, generator.nextInt(upperbound - lowerbound+ 1) + lowerbound, 0, "Jogador" +i, positions[generator.nextInt(3)+1], 0);
            
        }

        robots2[0] = new Robot(generator.nextInt(upperbound - lowerbound+ 1) + lowerbound, generator.nextInt(upperbound - lowerbound+ 1) + lowerbound, 0, "Jogador" + 0, positions[0], 0);
        for (int i = 1; i < robots2.length; i++) {
            robots2[i] = new Robot(generator.nextInt(upperbound - lowerbound+ 1) + lowerbound, generator.nextInt(upperbound - lowerbound+ 1) + lowerbound, 0, "Jogador" +i, positions[generator.nextInt(3)+1], 0);
            
        }


         team1 = new Team("Barcelona", "Messi", 0, 0, robots1);
         team2 = new Team("Real Madrid", "Ronaldo", 0, 0, robots2);


        System.out.println("\nGame Starting\n");
        System.out.println("Team1:\n");
        
        System.out.println(team1);
        for (int j = 0; j < robots1.length; j++) {
            System.out.println(robots1[j]);
        }
        System.out.println("\n");
        System.out.println(team2);
        for (int i = 0; i < robots2.length; i++) {
            System.out.println(robots2[i]);
            
        }

            } else if(choice==2){


                // jogo:
                Ball ball = new Ball(0, 0, 0, "White");
                Game game = new Game(team1, team2, ball, 60 , 0);

            } else {
                break;
            }
        }

        sc.close();
        

        

        
    }    
}
