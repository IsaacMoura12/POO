package Aula07;
import java.util.Random;
import java.util.Scanner;

// Area de jogo


public class GameTester {
    static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) {

        // inicializações
        String[] positions = {"Goalkeeper", "Defender", "Midfielder", "Striker"};
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


        System.out.println("Team1:\n");
        
        System.out.println(team1);
        for (int j = 0; j < robots1.length; j++) {
            System.out.println(robots1[j]);
        }
        System.out.println("\n");
        System.out.println("Team2:\n");
        System.out.println(team2);
        for (int i = 0; i < robots2.length; i++) {
            System.out.println(robots2[i]);
            
        }

            } else if(choice==2){


            

                // jogo:
                Ball ball = new Ball(0, 0, 0, "White");
                Game game = new Game(team1, team2, ball, 60 , 0);



                System.out.println("\nGame Starting...\n");
                System.out.println(team1 + " VS " + team2);

                while(game.time<=game.duration){

                    ball.move(generator.nextInt(upperbound - lowerbound+ 1) + lowerbound, generator.nextInt(upperbound - lowerbound+ 1) + lowerbound);
                    // ataque equipa 1
                    Robot selected = team1.players[generator.nextInt(5)];
                    double chance = team1.attack(selected);

                    selected.move(generator.nextInt(upperbound - lowerbound+ 1) + lowerbound, generator.nextInt(upperbound - lowerbound+ 1) + lowerbound);
                    double distance = selected.distanceTo(ball);
                    // modelo para proximidade do jogador da bola:

                    if(distance ==0){
                        
                            selected.scoreGoal();
                            team1.totalGoals++;
                            System.out.println(team1 + " SCORED!! ");
                            System.out.println("Scorer: " + selected.getId());
                            
                        
                    } else if(distance <= 15){
                        if(chance > 0.5){
                            selected.scoreGoal();
                            team1.totalGoals++;
                            System.out.println(team1 + " SCORED!! ");
                            System.out.println("Scorer: " + selected.getId());
                    }
                }


                    ball.move(generator.nextInt(upperbound - lowerbound+ 1) + lowerbound, generator.nextInt(upperbound - lowerbound+ 1) + lowerbound);


                    Robot selected2 = team2.players[generator.nextInt(5)];
                    double chance2= team2.attack(selected2);
                    distance = selected2.distanceTo(ball);



                    if(distance ==0){
                        selected2.scoreGoal();
                        team2.totalGoals++;
                        System.out.println(team2 + " SCORED!! ");
                        System.out.println("Scorer: " + selected2.getId());

                    }else if (distance<=15){

                    if(chance2 > 0.5){
                        selected2.scoreGoal();
                        team2.totalGoals++;
                        System.out.println(team2 + " SCORED!! ");
                        System.out.println("Scorer: " + selected2.getId());
                    }
                }

                    game.elapsedTime();
                }
                System.out.println("Game Over!\n");
                System.out.println(team1 + " [" + team1.totalGoals + "]---[" + team2.totalGoals+"]");
                if(team1.totalGoals>team2.totalGoals){
                    System.out.println(team1 + " WON! ");
                    System.out.println(game);

                } else if(team1.totalGoals<team2.totalGoals){
                    System.out.println(team2 + " WON! ");
                    System.out.println(game);

                } else{
                    System.out.println("DRAW!");
                    System.out.println(game);
                }

                // statistics of the game!

                double t1d = 0;
                double t2d = 0;
                for (int i = 0; i < robots1.length; i++) {
                    t1d = t1d + robots1[i].getDistance();
                    
                }

                for (int i = 0; i < robots2.length; i++) {
                    t2d = t2d + robots2[i].getDistance();
                    
                }

                int total = team1.totalGoals + team2.totalGoals;
                System.out.println("Game Statistics:");
                System.out.println("Number of goals: " + total);
                System.out.println("Distance covered by the ball: " + ball.getDistance());
                System.out.println("Distance covered by " + team1 +" : " +  t1d);
                System.out.println("Distance covered by " + team2 + " : " + t2d);


            } else {
                break;
            }
        }

        sc.close();
        

        

        
    }    
}
