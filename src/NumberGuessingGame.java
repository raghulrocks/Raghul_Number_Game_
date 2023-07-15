import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        int attempts = 0;
        int score = 0;
        boolean isCorrect = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            attempts++;

            if (guess == randomNumber) {
                isCorrect = true;
                score = 100 - (attempts - 1) * 10;
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Number of attempts: " + attempts);
                System.out.println("Score: " + score);
            } else if (guess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        } while (!isCorrect);

        System.out.println("Thank you for playing the Number Guessing Game!");

        scanner.close();
    }
}
