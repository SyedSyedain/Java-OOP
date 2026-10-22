import java.util.Scanner;

public class basics2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No");
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(+n + " * " + i + " = " + n * i);
        }
        sc.close();
    }
}
