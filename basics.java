public class basics {
    public static void main(String[] args) {
        System.out.println("Numbers Are");
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("Numbers Are");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Even Numbers Are");
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
        System.out.println("Odd Numbers Are");
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0)
                System.out.println(i);

        }
        System.out.println("Odd Numbers Are");
        for (int i = 1; i < 101; i = i + 2) {
            System.out.println(i);
        }

    }
}
