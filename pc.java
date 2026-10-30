import java.util.Scanner;

class pc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Order Of Matrix");

        if (args.length != 1) {
            System.out.println("Invalid Order");
            return;
        }
        int N = Integer.parseInt(args[0]);
        if (N < 0) {
            System.out.println(" Order Cant Be Negative");
            return;
        }
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        int[][] SUM = new int[N][N];

        System.out.println("Eneter First Matrix");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Eneter Second Matrix");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                SUM[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Sum Of Matrix");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(SUM[i][j] + " ");
            }
            System.out.println();
        }

    }
}
