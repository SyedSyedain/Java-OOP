
import java.util.Scanner;

public class Student {

    String name;

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

    // Static method
    static void displayCount() {
        System.out.println("Total Students Enrolled: " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            Student s = new Student(name);
        }

        // Calling static method
        Student.displayCount();

        sc.close();
    }
}
