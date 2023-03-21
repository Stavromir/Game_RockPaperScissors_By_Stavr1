import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String rock = "Rock";
        final String paper = "Paper";
        final String scissors = "Scissors";

        System.out.printf("Chose [R]ock, [P]aper, [S]cissors: ");

        String input = scanner.nextLine();

        String playerMove = "";

        if (input.equals("r") || input.equals("R") || input.equals("rock") || input.equals("Rock")) {
            playerMove = rock;
        }




    }
}
