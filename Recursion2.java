import java.util.Scanner;

public class Recursion2 {
    static int SumOfNat(int n) {
        if (n == 1)
            return 1;
        else
            return n + SumOfNat(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sum of " + n + " is " + SumOfNat(n));
        sc.close();

    }
}