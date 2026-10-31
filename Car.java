
import java.util.Scanner;

public class Car {

    double fuel;

    // Constructor
    Car(double fuel) {
        this.fuel = fuel;
    }

    // Call by Value
    void estimateFuel(double fuel, double consumed) {

        fuel = fuel - consumed;

        System.out.println("Estimated Remaining Fuel: " + fuel);
    }

    // Object Reference Passing
    void updateFuel(Car c, double consumed) {

        c.fuel = c.fuel - consumed;

        System.out.println("Actual Fuel Updated Successfully");
    }

    // Display method
    void display() {
        System.out.println("Current Fuel Level: " + fuel);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Fuel: ");
        double f = sc.nextDouble();

        Car c = new Car(f);

        System.out.print("Enter Estimated Fuel Consumption: ");
        double estimated = sc.nextDouble();

        System.out.print("Enter Actual Fuel Consumption: ");
        double actual = sc.nextDouble();

        // Call by Value
        System.out.println("\n--- CALL BY VALUE ---");
        c.estimateFuel(c.fuel, estimated);
        c.display();

        // Object Reference Passing
        System.out.println("\n--- OBJECT REFERENCE PASSING ---");
        c.updateFuel(c, actual);
        c.display();

        sc.close();
    }
}
