
import java.util.Scanner;

// Base class
class Person {

    String name;
    int age;
    String gender;

    static Scanner sc = new Scanner(System.in);

    // Read common details
    void read() {

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        gender = sc.nextLine();
    }

    // Display common details
    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

// Employee derived class
class Employee extends Person {

    int empid;
    String department;
    double salary;

    // Read employee details
    void read() {

        super.read();

        System.out.print("Enter Employee ID: ");
        empid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    // Display employee details
    void display() {

        super.display();

        System.out.println("Employee ID: " + empid);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Student derived class
class Student extends Person {

    String usn;
    String course;
    double marks;

    // Read student details
    void read() {

        super.read();

        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
        sc.nextLine();
    }

    // Display student details
    void display() {

        super.display();

        System.out.println("USN: " + usn);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}

// Main class
public class quest {

    public static void main(String[] args) {

        Employee[] emp = new Employee[5];
        Student[] stu = new Student[5];

        // Reading employee details
        System.out.println("----- ENTER EMPLOYEE DETAILS -----");

        for (int i = 0; i < 5; i++) {

            emp[i] = new Employee();

            System.out.println("\nEmployee " + (i + 1));
            emp[i].read();
        }

        // Reading student details
        System.out.println("\n----- ENTER STUDENT DETAILS -----");

        for (int i = 0; i < 5; i++) {

            stu[i] = new Student();

            System.out.println("\nStudent " + (i + 1));
            stu[i].read();
        }

        // Display employee details
        System.out.println("\n----- EMPLOYEE DETAILS -----");

        for (int i = 0; i < 5; i++) {

            System.out.println("\nEmployee " + (i + 1));
            emp[i].display();
        }

        // Display student details
        System.out.println("\n----- STUDENT DETAILS -----");

        for (int i = 0; i < 5; i++) {

            System.out.println("\nStudent " + (i + 1));
            stu[i].display();
        }
    }
}
