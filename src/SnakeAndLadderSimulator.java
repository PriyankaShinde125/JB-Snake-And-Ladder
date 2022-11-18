public class SnakeAndLadderSimulator {

    public static final int PLAYER_START_POSITION = 0;

    public static void main(String[] args) {

        System.out.println("Welcome to Snake & Ladder Simulator");
        int randomDie = (int) Math.floor(Math.random() * 6 + 1);
        System.out.println(randomDie);
    }
}