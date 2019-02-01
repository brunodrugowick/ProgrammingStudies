import java.util.Scanner;

public class NumbersGame {

    public static void main (String [] args) {

        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");

        Scanner scanner = new Scanner(System.in);

        for (int i = 10; i > 0; i--) {
            System.out.println("\nYou have " + i + " guess(es) left. What's my number?");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("\nYou WON! The number was "+ randomNumber + ".");
                return;
            } else if (guess > randomNumber)
                System.out.println("Number is smaller than " + guess);
            else
                System.out.println("Number is greater than " + guess);
        }
        System.out.println("\nYou LOSE, infidel! The number was "+ randomNumber + ".");
    }
}
