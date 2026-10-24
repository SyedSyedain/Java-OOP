import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit;
        int sum = 0;
        if (n < 0) {
            System.out.println("Invalid Input");
        }
        while (n > 0) {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
