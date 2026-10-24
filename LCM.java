import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lcm;

        for (lcm = 1;; lcm++) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
        }

        System.out.println("lcm is  = " + lcm);

        sc.close();
    }
}
