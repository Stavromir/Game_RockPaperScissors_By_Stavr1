import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String rock = "Rock";
        final String paper = "Paper";
        final String scissors = "Scissors";
        boolean newGame = true;
        int countPlayerWins = 0;
        int countComputerWins = 0;

        while (newGame) {

            System.out.println("Please make you decision from the following options.");
            System.out.print("Chose [R]ock, [P]aper or [S]cissors: ");

            String input = scanner.nextLine();

            String playerMove = "";

            while (true) {

                if (input.equals("r") || input.equals("R") || input.equals("rock") || input.equals("Rock")) {
                    playerMove = rock;
                    break;
                } else if (input.equals("p") || input.equals("P") || input.equals("paper") || input.equals("Paper")) {
                    playerMove = paper;
                    break;
                } else if (input.equals("s") || input.equals("S") || input.equals("scissors") || input.equals("Scissors")) {
                    playerMove = scissors;
                    break;
                } else {
                    System.out.println("Invalid input. Please try again...");
                    System.out.print("New input: ");
                    input = scanner.nextLine();
                }
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

            if (playerMove.equals(rock) && computerMove.equals(scissors) ||
                    playerMove.equals(paper) && computerMove.equals(rock) ||
                    playerMove.equals(scissors) && computerMove.equals(paper)) {

                countPlayerWins++;
                System.out.println("You win!");

            } else if (playerMove.equals(rock) && computerMove.equals(paper) ||
                    playerMove.equals(paper) && computerMove.equals(scissors) ||
                    playerMove.equals(scissors) && computerMove.equals(rock)) {

                countComputerWins++;
                System.out.println("You lose!");
            } else {
                System.out.println("This game was a draw.");
            }

            System.out.printf("Player wins: %d vs Computer wins: %d%n", countPlayerWins, countComputerWins);

            System.out.println("Do you want to play again?");
            System.out.println("[Y]es or [N]o");
            String playAgain = scanner.nextLine();

            while (true) {

                if (playAgain.equals("Y") || playAgain.equals("Yes") || playAgain.equals("yes")
                                    || playAgain.equals("y")) {
                    break;
                } else if (playAgain.equals("N") || playAgain.equals("No") || playAgain.equals("no")
                                    || playAgain.equals("n")) {
                    newGame = false;
                    System.out.println("Goodbye!");
                    break;
                } else {
                    System.out.println("Wrong input!");
                    System.out.println("Please choose again.");
                    playAgain = scanner.nextLine();
                }
            }
        }
    }
}
