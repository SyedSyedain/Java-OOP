class base {
    int x;

    int getx() {
        System.out.println("I Am In Base Class\n");
        return x;
    }

    void setx(int x) {
        this.x = x;
    }
}

class derived extends base {
    int y;

    int gety() {
        System.out.println("I Am In Dervied Class");
        return y;
    }

    void sety(int y) {
        this.y = y;
    }

}

public class inheritence {
    public static void main(String[] args) {
        base b = new base();
        derived d = new derived();
        d.sety(15);
        d.setx(12);
        b.setx(10);
        System.out.println(b.getx());
        System.out.println(d.getx());
        System.out.println(d.gety());

    }
}