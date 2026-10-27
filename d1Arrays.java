import java.util.Scanner;

public class d1Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int a : arr) {
            System.out.print(" " + a);
        }
        sc.close();
    }
}
