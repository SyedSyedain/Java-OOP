import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        System.out.println("Factors Are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                sum = sum + i;
            }

        }
        System.out.println("Sum Of Factors Is: " + sum);
        sc.close();
    }
}