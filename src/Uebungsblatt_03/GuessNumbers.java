package Uebungsblatt_03;

public class GuessNumbers {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Willkommen zum Zahlenraten-Spiel!");
        System.out.println("Ich habe eine Zahl zwischen 1 und 100 gewählt. Versuchen Sie sie zu erraten.");

        while (!hasGuessedCorrectly) {
            System.out.print("Geben Sie Ihre Vermutung ein: ");
            int userGuess = input.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Zu niedrig! Versuchen Sie es erneut.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Zu hoch! Versuchen Sie es erneut.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Herzlichen Glückwunsch! Sie haben die Zahl " + numberToGuess + " in " + numberOfTries + " Versuchen erraten.");
            }
        }

        input.close();
    }
}
