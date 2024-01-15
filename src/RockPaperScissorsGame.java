import java.util.Scanner;

class RockPaperScissorsGame {
    private final MoveStrategy computerPlayer;
    private final MoveStrategy humanPlayer;

    public RockPaperScissorsGame(MoveStrategy computerPlayer, MoveStrategy humanPlayer) {
        this.computerPlayer = computerPlayer;
        this.humanPlayer = humanPlayer;
    }

    public void play() {
        do {
            String computerMove = computerPlayer.generateMove();
            String playerMove = humanPlayer.generateMove();

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            } else if ((playerMove.equals("r") && computerMove.equals("s")) ||
                    (playerMove.equals("p") && computerMove.equals("r")) ||
                    (playerMove.equals("s") && computerMove.equals("p"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

        } while (playAgain());
    }

    private boolean playAgain() {
        System.out.println("Do you want to play again? (y/n)");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().equalsIgnoreCase("y");
    }
}