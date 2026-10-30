import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

        // Check command line argument
        if (args.length != 1) {
            System.out.println("Please Provide The Order N.");
            return;
        }

        // Read N from command line arguments
        int n = Integer.parseInt(args[0]);

        if (n <= 0) {
            System.out.println("Matrix Order Must Be Positive.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] sum = new int[n][n];

        // Read first matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Read second matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Add the two matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Display the resultant matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
