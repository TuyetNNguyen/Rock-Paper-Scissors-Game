import java.util.Arrays;
import java.util.Scanner;

class HumanPlayer implements MoveStrategy {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String generateMove() {
        String playerMove;

        while (true) {
            System.out.println("Please enter your move (r, p, or s)");
            playerMove = scanner.nextLine().toLowerCase();
            if (Arrays.asList(moves).contains(playerMove)) {
                break;
            }
            System.out.println(playerMove + " is not a valid move.");
        }

        return playerMove;
    }
}