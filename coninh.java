class base {
    int x;

    base() {
        System.out.println(" I Am A Constructor In Base Classs\n");
    }

    base(int x) {
        System.out.println(" I Am A Constructor In Base Classs With Value Of X :" + x);
    }

}

class derived extends base {
    int y;

    derived() {
        // super(10);

        System.out.println(" I Am A Constructor In Derived Classs\n");
    }

    derived(int x, int y) {
        super(x);
        System.out.println(" I Am A Constructor In Base Classs With Value Of Y :" + y);
    }

}

public class coninh {
    public static void main(String[] args) {
        derived d = new derived(10, 20);

    }
}
