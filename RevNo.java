public class RevNo {
    static int reverse(int n) {
        int revno = 0;

        while (n > 0) {
            int digit = n % 10;
            revno = (revno * 10) + digit;
            n = n / 10;

        }
        return revno;
    }

    public static void main(String[] args) {
        int result = reverse(110980);
        System.out.println(result);
    }
}