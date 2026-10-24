import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Elements");
        int n = sc.nextInt();
        int largest = -1;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter The " + i + " Element");
            int num = sc.nextInt();
            if (num >= largest)
                largest = num;
        }
        System.out.println("Largest :" + largest);
        sc.close();
    }
}
