import java.util.Scanner;

public class Stack2 {
    static Scanner sc = new Scanner(System.in);
    int[] stack = new int[10];
    int top = -1;
    int item;

    void push() {
        if (top == 9) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter The Element To Be Added");
            item = sc.nextInt();
            top++;
            stack[top] = item;
            System.out.println("Inserted Item" + item);
        }

    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            stack[top] = item;
            top--;
            System.out.println("Deleted Item" + item);
        }

    }

    void peek() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("Topmost Element " + stack[top]);
        }

    }

    void Display() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Stack2 s = new Stack2();
        int choice;
        while (true) {
            System.out.println("\n1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. PEEK");
            System.out.println("5. EXIT");

            System.out.println("Enter Choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.push();
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.Display();
                    break;

                case 4:
                    s.peek();
                    break;
                case 5:
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
