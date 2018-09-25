package app;

import data.SudokuBoard;

public class GameApp {
    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        System.out.println(sudokuBoard);
        GameController gameController = new GameController();
        gameController.controlLoop();
    }
}
