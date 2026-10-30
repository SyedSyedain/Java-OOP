
import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read coefficients
        System.out.println("Enter The Coefficients\n");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Check whether it is a quadratic equation
        if (a == 0) {
            System.out.println("Not A Quadratic Equation.");
            sc.close();
            return;
        }

        // Calculate discriminant
        double D = (b * b) - (4 * a * c);

        System.out.println("Discriminant = " + D);

        // Calculate roots based on discriminant
        if (D > 0) {

            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("Roots Are Real And Distinct.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } else if (D == 0) {

            double root = -b / (2 * a);

            System.out.println("Roots Are Real And Equal.");
            System.out.println("Root 1 = " + root);
            System.out.println("Root 2 = " + root);

        } else {

            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);

            System.out.println("Roots Are Complex.");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "I");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "I");
        }

        sc.close();
    }
}
