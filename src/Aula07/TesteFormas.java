package Aula07;
import java.util.Random;

public class TesteFormas {
    public static void main(String[] args) {

        System.out.println("\n@SHAPES PROGRAM TESTER@\n");
        String[] colors ={"Yellow","Green", "Blue", "Red", "Black","White"};
        Random rand = new Random();

        System.out.println("\nCircle RANDOM Generator\n");
        // criação de array com 10 objetos do tipo Circulo
        Forma circle[] = new Circle[10];
        for (int i = 0; i < circle.length; i++) {
            String color = colors[rand.nextInt(colors.length)]; // randomly choose a color
            circle[i] = new Circle(Math.floor(Math.random() * 5), color);
        }

        for (int i = 0; i < circle.length; i++) {
            //System.out.printf("%s P: %.2f %.2f %.2s\n", circle[i], circle[i].perimeter(), circle[i].area(),circle[i].getColor()); 
            System.out.println(circle[i]); 
        }

        int equalsc = 0;
        for (int i = 0; i < circle.length; i++) {
            if(circle[0].equals(circle[i]))
            equalsc = equalsc +1;
        }

        System.out.println("\nThere are " + equalsc + " circles equal to the first one!\n");



        System.out.println("\nTriangle RANDOM Generator\n");

        // criação de array com 10 objetos do tipo Triangulo
        Forma triangle[] = new Triangle[10];
        for (int i = 0; i < triangle.length; i++) {
            String color = colors[rand.nextInt(colors.length)]; // randomly choose a color

            triangle[i] = new Triangle(Math.floor(Math.random() * 2), Math.floor(Math.random() *2), Math.floor(Math.random())*2, color);        
        }

        for (int i = 0; i < triangle.length; i++) {
            //System.out.printf("%s P: %.2f %.2f %.2f\n", triangle[i], triangle[i].perimeter(), triangle[i].area());
            System.out.println(triangle[i]);
        }
        int equalst = 0;
        for (int i = 0; i < triangle.length; i++) {
            if(triangle[0].equals(triangle[i]))
            equalst = equalst +1;
        }
        System.out.println("\nThere are " + equalst + " triangles equal to the first one!\n");


        System.out.println("\nRectangle RANDOM Generator\n");

    // criação de array com 10 objetos do tipo Retangulo
    Forma[] rectangle = new Rectangle[10];
    for (int i = 0; i < rectangle.length; i++) {
        String color = colors[rand.nextInt(colors.length)]; // randomly choose a color

        rectangle[i] = new Rectangle(Math.floor(Math.random() * 5), Math.floor(Math.random() * 5),color);
    }

    for (int i = 0; i < rectangle.length; i++) {
        //System.out.println(rectangle[i] + " Perimetro: " + rectangle[i].perimeter() + "Area: " + rectangle[i].area());
        System.out.println(rectangle[i]);
    }
    int equalstt = 0;
    for (int i = 0; i < rectangle.length; i++) {
        if(rectangle[0].equals(rectangle[i]))
        equalstt = equalstt +1;
    }
    System.out.println("\nThere are " + equalstt + " rectangles equal to the first one!\n");
    }


        
    }