public class basic111 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int c = a + b;
            System.out.println(a);
            sum = sum + a;
            a = b;
            b = c;
        }
        System.out.println(sum);
    }
}
