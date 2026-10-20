// pass by value and reference
public class Lecture30 {
    static void change(int a) {
        a = 45;
    }

    public static void main(String[] args) {
        int x = 10;
        change(x);
        System.out.println("the value after change is   " + x);
    }
}
// no change is seen because a copy of value is passed