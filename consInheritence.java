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
        System.out.println(" I Am A Constructor In Base Classs With Value Of Y :" + y);
    }

}

public class consInheritence {
    public static void main(String[] args) {
        base b = new base();
        derived d = new derived();

    }
}
