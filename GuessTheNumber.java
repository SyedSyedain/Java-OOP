import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    int user_choice;
    int comp_choice;
    int chances;

    GuessTheNumber() {
        System.out.println("Welcome To The Game");
        Random r = new Random();
        comp_choice = r.nextInt(100);
        chances = 0;
    }

    void takeInput(int x) {
        user_choice = x;
    }

    boolean iscorrect() {
        if (user_choice < comp_choice) {
            System.out.println("Increase Your Number");
            chances++;

        } else if (user_choice > comp_choice) {
            System.out.println("Decrease Your Number");
            chances++;
        }

        else {
            System.out.println("You Win");
            chances++;
            System.out.println("Chances Taken " + chances);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        GuessTheNumber s = new GuessTheNumber();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Your Choice");
            int value = sc.nextInt();
            s.takeInput(value);

            if (s.iscorrect()) {
                break;
            }

        }
        sc.close();
    }
}