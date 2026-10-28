public class Palindrome {
    static int check(int n) {
        int revno = 0;
        int dup = n;

        while (n > 0) {
            int digit = n % 10;
            revno = (revno * 10) + digit;
            n = n / 10;

        }
        if (dup == revno) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int num = 121;

        System.out.println(check(num));
    }
}
