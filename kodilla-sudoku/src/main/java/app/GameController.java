package app;

import data.SudokuBoard;
import data.SudokuElement;
import utils.SudokuSolver;
import java.util.*;

public class GameController {
    public final String ADD_NUMBER = "ADD";
    public final String SUDOKU = "SUDOKU";
    public final String EXIT = "X";

    private Scanner scanner;
    private SudokuBoard board;
    private SudokuSolver sudokuSolver;
    private Random random;
    String option = "";
    String adding = "";

    public GameController() {
        scanner = new Scanner(System.in);
        random = new Random();
        this.board = new SudokuBoard();
        this.sudokuSolver = new SudokuSolver(board);
    }

    public void controlLoop() {
        entryToTheGame();
        while (!option.equals(EXIT)) {
            displayTheOptions();
            option = scanner.nextLine();
            switch (option) {
                case ADD_NUMBER:
                    System.out.println("Please type the value (1-9), first coordinate(row 0-8)," +
                            " second coordinate(column 0-8) in the right format namely [1-9,0-8,0-8]");
                    adding = scanner.nextLine();
                    int value = Integer.parseInt(adding.substring(0, 1));
                    int row = Integer.parseInt(adding.substring(2, 3));
                    int column = Integer.parseInt(adding.substring(4, 5));
                    board.setElement(new SudokuElement(value), row, column);
                    System.out.println(board);
                    break;
                case SUDOKU:
                    sudokuSolver.fillTheBoard();
                    break;
                case EXIT:
                    System.out.println("Thanks for the game! Hope to see you soon:)");
                    break;
                default:
                    System.out.println("There is no such an option. Please try again! ");
            }
        }
        scanner.close();
    }

    private void entryToTheGame() {
        System.out.println("Welcome in the \"Sudoku Game\". What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ". Let's begin");
        System.out.println("Initializing the new board.........");
        System.out.println(board);
        System.out.println("Please fill in your digits in the Sudoku SudokuBoard!");
    }

    private void displayTheOptions() {
        System.out.println(" Please type \"ADD\" to place your own numbers");
        System.out.println(" or type \"SUDOKU\" to solve the game,");
        System.out.println(" or please press \"X\" to exit the game.");
    }
}




