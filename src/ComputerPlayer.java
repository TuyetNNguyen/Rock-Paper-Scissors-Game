import java.util.Random;

class ComputerPlayer implements MoveStrategy {

    @Override
    public String generateMove() {
        int randomIndex = new Random().nextInt(moves.length);
        return moves[randomIndex];
    }
}