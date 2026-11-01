
import java.util.Scanner;

// Parent class
class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

// Circle class
class Circle extends Shape {

    void draw() {
        System.out.println("Drawing Circle");
    }

    void erase() {
        System.out.println("Erasing Circle");
    }
}

// Triangle class
class Triangle extends Shape {

    void draw() {
        System.out.println("Drawing Triangle");
    }

    void erase() {
        System.out.println("Erasing Triangle");
    }
}

// Square class
class Square extends Shape {

    void draw() {
        System.out.println("Drawing Square");
    }

    void erase() {
        System.out.println("Erasing Square");
    }
}

// Main class
public class anoter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Shape s;

        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                s = new Circle();
                break;

            case 2:
                s = new Triangle();
                break;

            case 3:
                s = new Square();
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        s.draw();
        s.erase();

        sc.close();
    }
}
