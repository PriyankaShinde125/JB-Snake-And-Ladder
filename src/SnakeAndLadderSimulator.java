public class SnakeAndLadderSimulator {
    public static final int PLAYER_START_POSITION = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        int currentPosition = PLAYER_START_POSITION;
        System.out.println("Welcome to Snake & Ladder Simulator");
        int randomDie = (int) Math.floor(Math.random() * 6 + 1);
        int move = (int) Math.floor(Math.random() * 3);
        switch (move) {
            case LADDER:
                currentPosition = currentPosition + randomDie;
                break;
            case SNAKE:
                if (currentPosition - randomDie < 0)
                    currentPosition = PLAYER_START_POSITION;
                else
                    currentPosition = currentPosition - randomDie;
                break;
            default:
                break;
        }
        System.out.println("Current position = "+currentPosition);
    }
}