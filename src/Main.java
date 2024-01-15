public class Main {
    public static void main(String[] args) {
        MoveStrategy computer = new ComputerPlayer();
        MoveStrategy player = new HumanPlayer();

        RockPaperScissorsGame game = new RockPaperScissorsGame(computer, player);
        game.play();
    }
}