import java.util.ArrayList;

public class SnakeAndLadderSimulator {
    public static final int PLAYER_START_POSITION = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WINNING_POSITION = 100;
    int player1Position = PLAYER_START_POSITION;
    int player2Position = PLAYER_START_POSITION;

    public static void main(String[] args) {

        System.out.println("Welcome to Snake & Ladder Simulator");

        SnakeAndLadderSimulator simulatorObj = new SnakeAndLadderSimulator();

        while (simulatorObj.player1Position <= WINNING_POSITION && simulatorObj.player2Position <= WINNING_POSITION) {
            if (simulatorObj.player1Position == WINNING_POSITION) {
                System.out.println("Player 1 is winner");
                break;
            } else if (simulatorObj.player2Position == WINNING_POSITION) {
                System.out.println("Player 2 is winner");
                break;
            } else {
                simulatorObj.player1Position = simulatorObj.player1Play(simulatorObj.player1Position, "Player1");
                simulatorObj.player2Position = simulatorObj.player2Play(simulatorObj.player2Position, "Player2");
            }
        }
    }

    private int player1Play(int player1Position, String playerName) {

        int randomDie = (int) Math.floor(Math.random() * 6 + 1);
        int move = (int) Math.floor(Math.random() * 3);

        switch (move) {
            case LADDER:
                player1Position += randomDie;
                if (player1Position > WINNING_POSITION)
                    player1Position = player1Position - randomDie;
                break;
            case SNAKE:
                player1Position = Math.max(player1Position - randomDie, PLAYER_START_POSITION);
                break;
            default:
                break;
        }
        System.out.println(playerName + " is at " + player1Position);
        return player1Position;
    }

    private int player2Play(int player2Position, String playerName) {

        int randomDie = (int) Math.floor(Math.random() * 6 + 1);
        int move = (int) Math.floor(Math.random() * 3);

        switch (move) {
            case LADDER:
                player2Position = player2Position + randomDie;
                if (player2Position > WINNING_POSITION)
                    player2Position = player2Position - randomDie;
                break;
            case SNAKE:
                player2Position = Math.max(player2Position - randomDie, PLAYER_START_POSITION);
                break;
            default:
                break;
        }
        System.out.println(playerName + " is at " + player2Position);
        return player2Position;
    }

}