interface resizable {
    void resizewidth(int width);

    void resizeheight(int height);
}

class rectangle implements resizable {
    int width;
    int height;

    rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }

    public void resizewidth(int width) {
        this.width = width;

    }

    public void resizeheight(int height) {
        this.height = height;
    }

    void display() {
        System.out.println("Width " + width);
        System.out.println("Height " + height);
    }

}

public class main2 {
    public static void main(String[] args) {

        rectangle r = new rectangle(10, 20);
        System.out.println("Before Resizing");

        r.display();
        r.resizeheight(30);
        r.resizewidth(40);
        System.out.println("After");
        r.display();

    }
}