
import java.util.Scanner;

public class StringCompare {

    // First version: Compare complete strings
    void usrstrcmp(String s1, String s2) {

        if (s1.equals(s2)) {
            System.out.println("Both Strings Are Equal");
        } else {
            System.out.println("Strings Are Not Equal");
        }
    }

    // Second version: Compare first n characters
    void usrstrcmp(String s1, String s2, int n) {

        if (s1.length() < n || s2.length() < n) {
            System.out.println("String Length Is Less Than N");
            return;
        }

        if (s1.substring(0, n).equals(s2.substring(0, n))) {
            System.out.println("First " + n + " Characters Are Equal");
        } else {
            System.out.println("First " + n + " Characters Are Not Equal");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringCompare obj = new StringCompare();

        System.out.print("Enter First String: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String s2 = sc.nextLine();

        // Calling first overloaded method
        obj.usrstrcmp(s1, s2);

        System.out.print("Enter Number Of Characters To Compare: ");
        int n = sc.nextInt();

        // Calling second overloaded method
        obj.usrstrcmp(s1, s2, n);

        sc.close();
    }
}
