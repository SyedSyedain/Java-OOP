import java.util.Scanner;

public class TUF3 {

    static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 2; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern9(n);
        sc.close();
    }

}
