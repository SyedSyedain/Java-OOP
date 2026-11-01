
interface A {
    void methodA1();

    void methodA2();
}

interface B {
    void methodB1();

    void methodB2();
}

interface C {
    void methodC1();

    void methodC2();
}

interface D extends A, B, C {
    void methodD();
}

class Parent {
    void parentMethod() {
        System.out.println("Parent Class Method");
    }
}

class MyClass extends Parent implements D {

    public void methodA1() {
        System.out.println("Method A1");
    }

    public void methodA2() {
        System.out.println("Method A2");
    }

    public void methodB1() {
        System.out.println("Method B1");
    }

    public void methodB2() {
        System.out.println("Method B2");
    }

    public void methodC1() {
        System.out.println("Method C1");
    }

    public void methodC2() {
        System.out.println("Method C2");
    }

    public void methodD() {
        System.out.println("Method D");
    }
}

public class main3 {

    static void displayA(A obj) {
        obj.methodA1();
        obj.methodA2();
    }

    static void displayB(B obj) {
        obj.methodB1();
        obj.methodB2();
    }

    static void displayC(C obj) {
        obj.methodC1();
        obj.methodC2();
    }

    static void displayD(D obj) {
        obj.methodA1();
        obj.methodA2();
        obj.methodB1();
        obj.methodB2();
        obj.methodC1();
        obj.methodC2();
        obj.methodD();
    }

    public static void main(String[] args) {

        MyClass obj = new MyClass();

        System.out.println("--- Interface A ---");
        displayA(obj);

        System.out.println("\n--- Interface B ---");
        displayB(obj);

        System.out.println("\n--- Interface C ---");
        displayC(obj);

        System.out.println("\n--- Interface D ---");
        displayD(obj);

        System.out.println("\n--- Parent Class ---");
        obj.parentMethod();
    }
}
