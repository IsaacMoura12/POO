package Aula09;

import java.util.Scanner;

public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();
        Scanner scanner = new Scanner(System.in);

        Plane plane1 = new CommercialPlane("100", "Airbus", "a320", 2001, 190, 870, 6);
        Plane plane2 = new CommercialPlane("101", "Airbus", "a320", 2001, 190, 870, 6);
        planeManager.addPlane(plane2);
        planeManager.addPlane(plane1);
        int choice;

        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Add a plane to the fleet");
            System.out.println("2. Remove a plane from the fleet");
            System.out.println("3. Search for a plane");
            System.out.println("4. Print summary of all planes in the fleet");
            System.out.println("5. Print list of all commercial planes in the fleet");
            System.out.println("6. Print list of all military planes in the fleet");
            System.out.println("7. Print the fastest plane in the fleet");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPlane(planeManager, scanner);
                    break;
                case 2:
                    removePlane(planeManager, scanner);
                    break;
                case 3:
                    searchPlane(planeManager, scanner);
                    break;
                case 4:
                    printAllPlanes(planeManager);
                    break;
                case 5:
                    printCommercialPlanes(planeManager);
                    break;
                case 6:
                    printMilitaryPlanes(planeManager);
                    break;
                case 7:
                    printFastestPlane(planeManager);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addPlane(PlaneManager planeManager, Scanner scanner) {

        Plane plane;
        //ID
        System.out.println("Insert Aircraft ID:");
        scanner.nextLine();
        String id = scanner.nextLine();
        while(id.length()==0){
            System.out.println("Insert Aircraft ID:");
            id = scanner.nextLine();
        }

        // FAB
        System.out.println("Insert Aircraft Manufacturer:");
        String fabricante = scanner.nextLine();
        while(fabricante.length()==0){
            System.out.println("Insert Aircraft Manufacturer:");
            fabricante = scanner.nextLine();
        }

        // MODEL

        System.out.println("Insert Aircraft Model:");
        String modelo = scanner.nextLine();
        while(modelo.length()==0){
            System.out.println("Insert Aircraft Model:");
            modelo = scanner.nextLine();
        }

        // ANO

        System.out.println("Insert Aircraft Production Year");
        int ano = scanner.nextInt();
        while(ano<=0){
            System.out.println("INVALID! Insert Aircraft Production Year");
            ano = scanner.nextInt();

        }

        //MAXPAX

        System.out.println("Insert Max Passengers:");
        int maxPassageiros = scanner.nextInt();
        while(maxPassageiros <=0){
            System.out.println("INVALID! Insert Max Passengers:");
            maxPassageiros = scanner.nextInt();
        }

        // MAX SPEED
        System.out.println("Insert Max Speed:");
        int maxVelocidade = scanner.nextInt();
        while(maxVelocidade<=0){
            System.out.println("INVÁLID! Insert Max Speed:");
            maxVelocidade = scanner.nextInt();
        }

        System.out.println("Aircraft type:\n");
        System.out.println("Commercial - 0");
        System.out.println("Military - 1");

        int option = scanner.nextInt();

        while(option != 0 && option != 1){
            System.out.println("Aircraft type:\n");
            System.out.println("Commercial - 0");
            System.out.println("Military - 1");
            option = scanner.nextInt();
        }


        //COMERCIAL
        if(option == 0){
            System.out.println("Insert number of crew members:");
            int crew = scanner.nextInt();
            while(crew<=0){
                System.out.println("INVALID! Insert number of crew members:");
                crew = scanner.nextInt();
            }

             plane = new CommercialPlane(id, fabricante, modelo, ano, maxPassageiros, maxVelocidade, crew);
             planeManager.addPlane(plane);

        //MILITAR
        } else if (option == 1){
            System.out.println("Insert number of missiles:");
            int missiles = scanner.nextInt();
            while(missiles<=0){
                System.out.println("INVALID! Insert number of missiles:");
                missiles = scanner.nextInt();
            }

             plane = new MilitaryPlane(id, fabricante, modelo, ano, maxPassageiros, maxVelocidade, missiles);
            planeManager.addPlane(plane);
        } else {
            plane = null;
            System.out.println("ERROR!!!");
        }

        System.out.println("Aircraft Added!");


        


    }

    private static void removePlane(PlaneManager planeManager, Scanner scanner) {

        System.out.println("Insert plane ID to remove:");
        scanner.nextLine();
        String id = scanner.nextLine();
        while(id.length()==0){
            System.out.println("Insert plane ID to remove:");
            id = scanner.nextLine();
        }

        planeManager.removePlane(id);
    }

    private static void searchPlane(PlaneManager planeManager, Scanner scanner) {

        System.out.println("Insert plane ID to search:");
        scanner.nextLine();
        String id = scanner.nextLine();
        while(id.length()==0){
            System.out.println("Insert plane ID to search:");
            id = scanner.nextLine();
        }

        System.out.println(planeManager.searchPlane(id));
        //planeManager.searchPlane(id);
    }

    private static void printAllPlanes(PlaneManager planeManager) {
        System.out.println(planeManager.printAllPlanes());
        //planeManager.printAllPlanes();
    }

    private static void printCommercialPlanes(PlaneManager planeManager) {
        System.out.println(planeManager.getCommercialPlanes());
        //planeManager.getCommercialPlanes();
    }

    private static void printMilitaryPlanes(PlaneManager planeManager) {
        System.out.println(planeManager.getMilitaryPlanes());
        //planeManager.getMilitaryPlanes();
    }

    private static void printFastestPlane(PlaneManager planeManager) {
        System.out.println(planeManager.getFastestPlane());
        //planeManager.getFastestPlane();
    }
}
