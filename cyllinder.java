public class cyllinder {
    int radius;
    int height;

    int getradius() {
        return radius;
    }

    void setradius(int r) {
        radius = r;
    }

    int getheight() {
        return height;
    }

    void setheight(int h) {
        height = h;
    }

    public static void main(String[] args) {
        cyllinder c = new cyllinder();
        c.setradius(10);
        c.setheight(15);
        System.out.println(c.getradius());
        System.out.println((c.getheight()));
    }
}