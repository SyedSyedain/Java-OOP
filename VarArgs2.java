// we can add some compulsary arguments as well
public class VarArgs2 {

    static int add(int a, int... arr) {
        int sum = a;
        for (int n : arr) {
            sum = sum + n;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("sum of 2 digit " + add(2, 5));
        System.out.println("sum of 4 digit " + add(2, 5, 3, 4));
        System.out.println("sum of 5 digit " + add(2, 5, 4, 5, 6));
        System.out.println("sum of something " + add(1));

    }
}
