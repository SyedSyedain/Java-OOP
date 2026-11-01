import java.util.Scanner;

abstract class shape {
    abstract double calculateArea();

    abstract double calculatePeri();
}

class Circle extends shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePeri() {
        return Math.PI * radius * 2;
    }
}

class Triangle extends shape {
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }

    double calculatePeri() {
        return side1 * side2 * side3;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr Teh Radius Of Circle");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        System.out.println(" Circle");
        System.out.println("Area " + c.calculateArea());
        System.out.println("Perimeter " + c.calculatePeri());
        System.out.print("\nEnter Triangle Base: ");
        double b = sc.nextDouble();

        System.out.print("Enter Triangle Height: ");
        double h = sc.nextDouble();

        System.out.print("Enter Side 1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter Side 2: ");
        double s2 = sc.nextDouble();

        System.out.print("Enter Side 3: ");
        double s3 = sc.nextDouble();

        Triangle t = new Triangle(b, h, s1, s2, s3);

        System.out.println("\n--- TRIANGLE ---");
        System.out.println("Area: " + t.calculateArea());
        System.out.println("Perimeter: " + t.calculatePeri());

        sc.close();

    }

}
