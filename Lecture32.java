// in case if arrays and objects passed to method reference is passed so changes will be there

public class Lecture32 {
    static void change(int[] arr) {
        arr[0] = 17;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        change(arr);
        System.out.println(arr[0]);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
