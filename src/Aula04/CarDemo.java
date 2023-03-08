package Aula04;
import java.util.Scanner;

class Car {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        //acumular distância percorrida
        this.kms += distance;
    }

}

public class CarDemo {

    static Scanner sc = new Scanner(System.in);

    static int registerCars(Car[] cars) {
        //  pede dados dos carros ao utilizador e acrescenta ao vetor
        // registo de carros termina quando o utilizador inserir uma linha vazia 
        // devolve número de carros registados
        int numCars = 0;
        System.out.println("Registar carros (terminar com linha vazia):");
        while (true) {
            String input = sc.nextLine();
            if (input.isBlank()) {
                break;
            }
            String[] carData = input.split(" ");
            if (carData.length == 4) {
                cars[numCars] = new Car(carData[0], carData[1], Integer.parseInt(carData[2]), Integer.parseInt(carData[3]));
                numCars++;
            } else {
                System.out.println("Dados do carro inválidos. Por favor insira no formato 'marca modelo ano quilómetros'.");
            }
        }
        return numCars;
        //System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
        
   }

    static void registerTrips(Car[] cars, int numCars) {
        //  pede dados das viagens ao utilizador e atualiza informação do carro
        // registo de viagens termina quando o utilizador inserir uma linha vazia 
        System.out.print("Registe uma viagem no formato \"carro:distância\": ");
        while (true) {
            String input = sc.nextLine();
            if (input.isBlank()) {
                break;
            }
            String[] tripData = input.split(":");
            if (tripData.length == 2) {
                String carMake = tripData[0];
                int distance = Integer.parseInt(tripData[1]);
                boolean carFound = false;
                for (int i = 0; i < numCars; i++) {
                    if (cars[i].make.equals(carMake)) {
                        cars[i].drive(distance);
                        carFound = true;
                        break;
                    }
                }
                if (!carFound) {
                    System.out.println("Carro não encontrado.");
                }
            } else {
                System.out.println("Dados da viagem inválidos. Por favor insira no formato 'carro:distância'.");
            }
        }
    }


    static void listCars(Car[] cars) {
        System.out.println("\nCarros registados: ");
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.printf("%s %s, %d, kms: %d\n", cars[i].make, cars[i].model, cars[i].year, cars[i].kms);
            }
        }
        
        //  lista todos os carros registados
        // Exemplo de resultado
        // Carros registados: 
        // Toyota Camry, 2010, kms: 234346
        // Renault Megane Sport Tourer, 2015, kms: 32536
        
        //System.out.println("\n");
    }

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        int numCars = registerCars(cars);

        if (numCars>0) {
            listCars(cars);
            registerTrips(cars, numCars);
            listCars(cars);
        }

        sc.close();

    }
}