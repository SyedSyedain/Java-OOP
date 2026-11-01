import java.util.Scanner;

class Circle {
    private double radius;
    private String color;

    Circle() {
        radius = 1;
        color = "Red";

    }

    Circle(double radius) {
        this.radius = radius;
        color = "Red";
    }

    public double getradius() {
        return radius;
    }

    public double getarea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius Of Circle");
        double r = sc.nextDouble();
        Circle c2 = new Circle(r);

        System.out.println("Circle 1");
        System.out.println("Radius Of Circle 1 :" + c1.getradius());
        System.out.println("Area Of Circle 1 :" + c1.getarea());
        System.out.println("Circle 2");

        System.out.println("Radius Of Circle 2 :" + c2.getradius());
        System.out.println("Area Of Circle 2:" + c2.getarea());
        sc.close();

    }
}
