
public class BasicMaths {
    static int count(int n) {
        int cnt = (int) Math.log10(n) + 1;
        return cnt;
    }

    public static void main(String[] args) {
        int num = 77789;
        System.out.println(count(num));
    }
}
