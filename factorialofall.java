
//factorial of all numbers from 1 to n
import java.util.Scanner;

public class factorialofall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number Is " + n);
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            System.out.println("Factorial Of " + i + " Is " + fact);

        }
        sc.close();
    }

}
