import java.util.Scanner;
import java.util.Arrays;

public class d2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        /*
         * for (int i = 0; i < arr.length; i++) {
         * System.out.println(Arrays.toString(arr[i]));
         * }
         */
        for (int[] a : arr)
            System.out.println(Arrays.toString(a));
        sc.close();
    }
}