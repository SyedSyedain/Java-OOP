import java.util.Scanner;

public class sumtoeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
