import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random secret number between 1 and 5
        int secretNumber = (int) (Math.random() * 5) + 1;

        // Ask the user to guess
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a secret number between 1 and 5: ");
        int userGuess = scanner.nextInt();

        // Print whether their guess matched the secret number
        if (userGuess == secretNumber) {
            System.out.println("Congratulations! Your guess matched the secret number.");
        } else {
            System.out.println("Sorry, that's incorrect. The secret number was: " + secretNumber);
        }

        scanner.close();
    }
}
