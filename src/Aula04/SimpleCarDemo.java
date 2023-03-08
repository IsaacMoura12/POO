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
        this.kms = this.kms + distance;
    }
}

public class SimpleCarDemo {

    static Scanner sc = new Scanner(System.in);

    static void listCars(Car[] cars) {
        //lista todos os carros registados
        // Exemplo de resultado
        // Carros registados: 
        // Renault Megane Sport Tourer, 2015, kms: 35356
        // Toyota Camry, 2010, kms: 32456
        // Mercedes Vito, 2008, kms: 273891

        System.out.println("Carros registados:");
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("%s %s, %d, kms: %d\n", cars[i].make, cars[i].model, cars[i].year, cars[i].kms);
            
        }
    }

    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car("Ford", "Focus", 2020,35000);
        cars[1] = new Car("BMW", "S1", 2023,20000);
        cars[2] = new Car("Audio", "rs4", 2023,2);

        listCars(cars);

        // Adicionar 10 viagens geradas aleatoriamente
        for (int i=0; i<10; i++) {
            int j = (int)Math.round(Math.random()*2); // escolhe um dos 3 carros
            int kms = (int)Math.round(Math.random()*1000); // viagem até 1000 kms
            System.out.printf("Carro %d viajou %d quilómetros.\n", j, kms);
            
            cars[j].drive(kms);
            //System.out.printf("kms atualizados do carro %d: %d\n", j,cars[j].kms);
        }

        listCars(cars);

        sc.close();

    }
}