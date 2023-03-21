import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String rock = "Rock";
        final String paper = "Paper";
        final String scissors = "Scissors";

        System.out.println("Chose [R]ock, [P]aper, [S]cissors: ");

        String input = scanner.nextLine();

        String playerMove = "";

        if (input.equals("r") || input.equals("R") || input.equals("rock") || input.equals("Rock")) {
            playerMove = rock;
        } else if (input.equals("p") || input.equals("P") || input.equals("paper") || input.equals("Paper")) {
            playerMove = paper;
        } else if (input.equals("s") || input.equals("S") || input.equals("scissors") || input.equals("Scissors")) {
            playerMove = scissors;
        } else {
            System.out.println("Invalid input. Please try again...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);

        String computerMove = "";

        switch (computerRandomNumber) {

            case 1:
                computerMove = rock;
                break;
            case 2:
                computerMove = paper;
                break;
            case 3:
                computerMove = scissors;
                break;
        }

        System.out.printf("The computer choice is %s.%n", computerMove);



    }
}
