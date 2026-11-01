
class Car {
    int speed;
    double regularPrice;
    String color;

    Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {
    int weight;

    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.90;
        } else {
            return regularPrice * 0.80;
        }
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;

    Ford(int speed, double regularPrice, String color,
            int year, int manufacturerDiscount) {

        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    double getSalePrice() {
        return regularPrice - manufacturerDiscount;
    }
}

class Sedan extends Car {
    int length;

    Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95;
        } else {
            return regularPrice * 0.90;
        }
    }
}

public class MyOwnAutoShop {
    public static void main(String[] args) {

        Sedan sedan = new Sedan(180, 25000, "White", 18);

        Ford ford = new Ford(200, 40000, "Black", 2025, 3000);

        System.out.println("----- SEDAN DETAILS -----");
        System.out.println("Speed: " + sedan.speed);
        System.out.println("Regular Price: " + sedan.regularPrice);
        System.out.println("Color: " + sedan.color);
        System.out.println("Length: " + sedan.length);
        System.out.println("Sale Price: " + sedan.getSalePrice());

        System.out.println("\n----- FORD DETAILS -----");
        System.out.println("Speed: " + ford.speed);
        System.out.println("Regular Price: " + ford.regularPrice);
        System.out.println("Color: " + ford.color);
        System.out.println("Year: " + ford.year);
        System.out.println("Manufacturer Discount: " + ford.manufacturerDiscount);
        System.out.println("Sale Price: " + ford.getSalePrice());
    }
}
