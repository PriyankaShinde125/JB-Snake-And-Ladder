import java.util.ArrayList;

public class SnakeAndLadderSimulator {
    public static final int PLAYER_START_POSITION = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WINNING_POSITION = 100;
    int currentPosition = PLAYER_START_POSITION;
    int diceCount = 0;
    ArrayList<Integer> positionAtDice;

    public static void main(String[] args) {

        System.out.println("Welcome to Snake & Ladder Simulator");

        SnakeAndLadderSimulator simulatorObj = new SnakeAndLadderSimulator();
        simulatorObj.positionAtDice = new ArrayList<>();

        while (simulatorObj.currentPosition < WINNING_POSITION) {
            simulatorObj.play();
        }

        for (int dice = 0; dice < simulatorObj.positionAtDice.size(); dice++) {
            System.out.println("Dice = " + dice + " -> " + simulatorObj.positionAtDice.get(dice));
        }
    }

    public void play() {

        int randomDie = (int) Math.floor(Math.random() * 6 + 1);
        int move = (int) Math.floor(Math.random() * 3);

        switch (move) {
            case LADDER:
                currentPosition = currentPosition + randomDie;
                if (currentPosition > WINNING_POSITION)
                    currentPosition = currentPosition - randomDie;
                break;
            case SNAKE:
                if (currentPosition - randomDie < PLAYER_START_POSITION)
                    currentPosition = PLAYER_START_POSITION;
                else
                    currentPosition = currentPosition - randomDie;
                break;
            default:
                break;
        }

        positionAtDice.add(currentPosition);
    }
}