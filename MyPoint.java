
import java.util.Scanner;

public class MyPoint {

    int x;
    int y;

    // Default constructor
    MyPoint() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Set coordinates
    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Get coordinates
    int[] getXY() {
        return new int[] { x, y };
    }

    // toString method
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Distance from given coordinates
    double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Distance from another object
    double distance(MyPoint another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Distance from origin
    double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyPoint p1 = new MyPoint();

        System.out.println("Enter X And Y Coordinates:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        MyPoint p2 = new MyPoint(x, y);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        System.out.println("Enter New X And Y Coordinates:");
        x = sc.nextInt();
        y = sc.nextInt();

        p1.setXY(x, y);

        int[] coordinates = p1.getXY();

        System.out.println("X = " + coordinates[0]);
        System.out.println("Y = " + coordinates[1]);

        System.out.println("Updated Point: " + p1);

        System.out.println("Enter Coordinates For Distance:");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Distance = " + p1.distance(x, y));

        System.out.println("Distance Between Points = " + p1.distance(p2));

        System.out.println("Distance From Origin = " + p1.distance());

        sc.close();
    }
}
