
import java.util.Random;
import java.util.Scanner;

public class Rockpaper {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("=== ROCK PAPER SCISSORS ===");
        System.out.println("0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Scissors");
        System.out.print("Enter Your Choice: ");

        int pc = sc.nextInt();

        if (pc < 0 || pc > 2) {
            System.out.println("Invalid Choice! Enter 0, 1, Or 2.");
        } else {
            int cc = r.nextInt(3);

            String[] choices = { "Rock", "Paper", "Scissors" };

            System.out.println("Your Choice: " + choices[pc]);
            System.out.println("Computer's Choice: " + choices[cc]);

            if (pc == cc) {
                System.out.println("It's A Draw!");
            } else if ((pc == 0 && cc == 2) ||
                    (pc == 1 && cc == 0) ||
                    (pc == 2 && cc == 1)) {
                System.out.println("You Win!");
            } else {
                System.out.println("Computer Wins!");
            }
        }

        sc.close();
    }
}
