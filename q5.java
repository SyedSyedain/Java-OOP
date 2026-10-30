
import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Replace duplicate elements with zero
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    arr[i] = 0;
                    break;
                }
            }
        }

        // Display updated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
