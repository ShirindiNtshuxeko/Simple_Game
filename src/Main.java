import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        int maxAttempts = 3;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {
            System.out.print("Guess a number between 1 and 10: ");
            int guess = scanner.nextInt();

            // Check if the guess is within the valid range
            if (guess < 1 || guess > 10) {
                System.out.println("Invalid number. Please enter a number between 1 and 10.");
                continue;  // Skip the rest of the loop and ask for input again
            }

            attempts++;

            if (guess == number) {
                System.out.println("You won!");
                break;
            } else {
                System.out.println("Incorrect guess. Attempts left: " + (maxAttempts - attempts));
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you ran out of attempts. The correct number was: " + number);
        }
    }
}