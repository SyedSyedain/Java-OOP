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

        System.out.println(" I Am A Constructor In Derived Classs\n");
    }

    derived(int x, int y) {
        super(x);
        System.out.println(" I Am A Constructor In Base Classs With Value Of Y :" + y);
    }

}

class child extends derived {
    int y;

    child() {

        System.out.println(" I Am A Constructor In Child Classs\n");
    }

    child(int x, int y, int z) {
        super(x, y);
        System.out.println(" I Am A Constructor In Base Classs With Value Of Z :" + z);
    }

}

public class coninhe {
    public static void main(String[] args) {
        child c = new child(1, 2, 3);

    }
}
