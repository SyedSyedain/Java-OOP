
import java.util.Scanner;

public class fibonacci {
    static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "n must be non-negative");
        }

        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(
                "Nth element of Fibonacci series at index "
                        + n + " is " + fib(n));

        sc.close();
    }
}
