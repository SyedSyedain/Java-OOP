
public class Outer {

    // Outer class display method
    void display() {
        System.out.println("This Is Outer Class");
    }

    // Inner class
    class Inner {

        void display() {
            System.out.println("This Is Inner Class");
        }
    }

    // Main method
    public static void main(String[] args) {

        Outer obj = new Outer();

        // Calling outer class method
        obj.display();

        // Creating inner class object
        Outer.Inner obj1 = obj.new Inner();

        // Calling inner class method
        obj1.display();
    }
}
