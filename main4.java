
import java.util.Scanner;

class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void processPayment() {
        System.out.println("Processing Payment");
    }
}

class CreditCardPayment extends Payment {

    CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        double total = amount + (amount * 0.02);

        System.out.println("Credit Card Payment");
        System.out.println("Final Payable Amount: " + total);
    }
}

class UPIPayment extends Payment {

    UPIPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        double total = amount + 5;

        System.out.println("UPI Payment");
        System.out.println("Final Payable Amount: " + total);
    }
}

class NetBankingPayment extends Payment {

    NetBankingPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        double total = amount + (amount * 0.015);

        System.out.println("Net Banking Payment");
        System.out.println("Final Payable Amount: " + total);
    }
}

public class main4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Payment Amount: ");
        double amount = sc.nextDouble();

        System.out.println("\nChoose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();

        Payment p;

        switch (choice) {

            case 1:
                p = new CreditCardPayment(amount);
                break;

            case 2:
                p = new UPIPayment(amount);
                break;

            case 3:
                p = new NetBankingPayment(amount);
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        System.out.println();

        p.processPayment();

        sc.close();
    }
}
