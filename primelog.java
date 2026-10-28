public class primelog {

    static void divisor(int n) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;

                if (n / i != i) {
                    count++;
                }

            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }

    public static void main(String[] args) {
        int num = 11;
        divisor(num);
    }
}
