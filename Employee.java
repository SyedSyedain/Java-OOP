
import java.util.Scanner;

public class Employee {

    String name;
    int emp_id;
    String department;
    int age;
    String designation;
    double salary;

    static Scanner sc = new Scanner(System.in);

    // Method to read employee details
    void read() {

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        emp_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Designation: ");
        designation = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }

    // Method to display employee details
    void display() {

        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    // Method to calculate Sales department salary
    void salesSalary(Employee emp[]) {

        double total = 0;

        for (int i = 0; i < emp.length; i++) {

            if (emp[i].department.equalsIgnoreCase("Sales")) {
                total = total + emp[i].salary;
            }
        }

        System.out.println("Total Sales Department Salary: " + total);
    }

    // Method to find highest paid Purchase Manager
    void highestManager(Employee emp[]) {

        Employee highest = null;

        for (int i = 0; i < emp.length; i++) {

            if (emp[i].department.equalsIgnoreCase("Purchase") &&
                    emp[i].designation.equalsIgnoreCase("Manager")) {

                if (highest == null || emp[i].salary > highest.salary) {
                    highest = emp[i];
                }
            }
        }

        if (highest != null) {
            System.out.println("\nHighest Paid Manager In Purchase:");
            highest.display();
        } else {
            System.out.println("No Manager Found In Purchase Department.");
        }
    }

    public static void main(String[] args) {

        Employee[] emp = new Employee[5];

        // Reading details
        for (int i = 0; i < 5; i++) {

            emp[i] = new Employee();

            System.out.println("\nEnter Details Of Employee " + (i + 1));
            emp[i].read();
        }

        // Displaying details
        System.out.println("\n----- EMPLOYEE DETAILS -----");

        for (int i = 0; i < 5; i++) {

            System.out.println("\nEmployee " + (i + 1));
            emp[i].display();
        }

        // Creating object to call operation methods=
        Employee obj = new Employee();

        obj.salesSalary(emp);
        obj.highestManager(emp);

        sc.close();
    }
}
