import java.util.ArrayList;

public class AllDivisor {

    static void divisor(int n) {
        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                ls.add(i);

                if (n / i != 1) {
                    ls.add(n / i);
                }
            }
        }
        ls.sort(null);
        System.out.println(ls);

    }

    public static void main(String[] args) {
        int num = 36;
        divisor(num);
    }
}
