import java.util.Scanner;

class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void display() {
        System.out.println("Decimal No :" + number);
    }
}

class HexNum extends Num {

    HexNum(int number) {
        super(number);
    }

    @Override
    void display() {
        System.out.println("Hexadecimal No :" + Integer.toHexString(number));
    }
}

public class week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr Number");
        int n = sc.nextInt();
        Num obj1 = new Num(n);
        HexNum obj2 = new HexNum(n);

        obj1.display();
        obj2.display();

    }
}
