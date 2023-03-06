package Aula04;


// Programa para teste dos objetos Circle, Triangle, Rectangle
public class Formas {
    public static void main(String[] args) {
        

        // criação de array com 10 objetos do tipo Circulo
        Circle circle[] = new Circle[10];
        for (int i = 0; i < circle.length; i++) {
            circle[i] = new Circle(Math.floor(Math.random() * 5));
        }

        for (int i = 0; i < circle.length; i++) {
            System.out.printf("%s P: %.2f %.2f\n", circle[i], circle[i].perimeter(), circle[i].area());  
        }

        int equalsc = 0;
        for (int i = 0; i < circle.length; i++) {
            if(circle[0].equals(circle[i]))
            equalsc = equalsc +1;
        }

        System.out.println("Existem " + equalsc + " circulos iguais ao primeiro!");




        // criação de array com 10 objetos do tipo Triangulo
        Triangle triangle[] = new Triangle[10];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new Triangle(Math.floor(Math.random() * 2), Math.floor(Math.random() *2), Math.floor(Math.random())*2);        
        }

        for (int i = 0; i < triangle.length; i++) {
            System.out.printf("%s P: %.2f %.2f %.2f\n", triangle[i], triangle[i].perimeter(), triangle[i].area());
        }
        int equalst = 0;
        for (int i = 0; i < triangle.length; i++) {
            if(triangle[0].equals(triangle[i]))
            equalst = equalst +1;
        }
        System.out.println("Existem " + equalst + " triangulos iguais ao primeiro!");



    // criação de array com 10 objetos do tipo Retangulo
    Rectangle[] rectangle = new Rectangle[10];
    for (int i = 0; i < rectangle.length; i++) {
        rectangle[i] = new Rectangle(Math.floor(Math.random()*2), Math.floor(Math.random()*2));
    }

    for (int i = 0; i < rectangle.length; i++) {
        System.out.println(rectangle[i] + " Perimetro: " + rectangle[i].perimeter() + "Area: " + rectangle[i].area());
    }
    int equalstt = 0;
    for (int i = 0; i < rectangle.length; i++) {
        if(rectangle[0].equals(rectangle[i]))
        equalstt = equalstt +1;
    }
    System.out.println("Existem " + equalstt + " retangulos iguais ao primeiro!");
    }



    
}
