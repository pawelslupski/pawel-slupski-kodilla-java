package app;

public class GameApp {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.controlLoop();
    }
}
