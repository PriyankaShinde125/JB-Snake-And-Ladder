public class SnakeAndLadderSimulator {
    public static final int PLAYER_START_POSITION = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int WINNING_POSITION = 100;
    int currentPosition = PLAYER_START_POSITION;

    public static void main(String[] args) {
        SnakeAndLadderSimulator simulatorObj = new SnakeAndLadderSimulator();
        System.out.println("Welcome to Snake & Ladder Simulator");

        while (simulatorObj.currentPosition < WINNING_POSITION) {
            simulatorObj.play();
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

        System.out.println("Current position = " + currentPosition);
    }
}