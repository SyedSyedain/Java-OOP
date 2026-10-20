public class VarArgs {

    static int add(int... arr) {
        int sum = 0;
        for (int n : arr) {
            sum = sum + n;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("sum of 2 digit " + add(2, 5));
        System.out.println("sum of 4 digit " + add(2, 5, 3, 4));
        System.out.println("sum of 5 digit " + add(2, 5, 4, 5, 6));
        System.out.println("sum of nothing " + add());

    }
}
