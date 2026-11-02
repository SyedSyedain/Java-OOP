
import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);

    String name;
    int mark1, mark2, mark3;
    double average;

    // Static variable
    static int count = 0;

    // Static block
    static {
        System.out.println("Welcome To Student Enrollment System");
    }

    // Constructor
    Student(String name) {
        this.name = name;
        count++;
    }

    // Read three test marks
    void readMarks() {
        System.out.println("Enter Three Test Marks:");

        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();

        sc.nextLine();
    }

    // Calculate average of best two marks
    void calculateAverage() {
        int smallest = Math.min(mark1, Math.min(mark2, mark3));

        average = (mark1 + mark2 + mark3 - smallest) / 2.0;
    }

    // Display student details
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Average Of Best Two Marks: " + average);
    }

    // Static method
    static void displayCount() {
        System.out.println("Total Students Enrolled: " + count);
    }

    public static void main(String[] args) {

        System.out.print("Enter Number Of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            Student s = new Student(name);

            s.readMarks();

            s.calculateAverage();

            s.display();
        }

        // Calling static method
        System.out.println("\n--- Enrollment Summary ---");
        Student.displayCount();

        sc.close();
    }
}
