package app;

import data.SudokuBoard;
import data.SudokuSolver;
import java.util.*;

public class GameController {
    public final String ADD_NUMBER = "ADD";
    public final String SUDOKU = "SUDOKU";
    public final String EXIT = "X";
    public final String NEW = "NEW";

    private Scanner scanner;
    private SudokuBoard board;
    private SudokuSolver solver;
    String option = "";
    String adding = "";

    public GameController() {
        scanner = new Scanner(System.in);
        this.board = new SudokuBoard();
        this.solver = new SudokuSolver(board);
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
                    if (adding.length() > 5) {
                        System.out.println("Sorry but the format of input is wrong! Try again!");
                        break;
                    }
                    int value;
                    int row;
                    int column;
                    try {
                        value = Integer.parseInt(adding.substring(0, 1));
                        row = Integer.parseInt(adding.substring(2, 3));
                        column = Integer.parseInt(adding.substring(4, 5));
                        if(solver.canSetValue(row, column, value)) {
                            board.setTheElement(row, column, value);
                        } else {
                            System.out.println("You can't place that number here! It's against the rules!");
                        }
                    } catch (NumberFormatException | IndexOutOfBoundsException ex ) {
                        System.out.println("Sorry but the format of input is wrong!" + "\n" +
                                " Please type the value and place on board in a correct" +
                                " format indicated above");
                    }
                    System.out.println(board);
                    break;
                case SUDOKU:
                    System.out.println("Solving the sudoku board....");
                    if (solver.solve()) {
                        System.out.println("Sudoku solved successfully:)");
                        System.out.println(board);
                    } else { System.out.println("Unfortunately this sudoku cannot be solved:(");}
                    break;
                case NEW:
                    controlLoop();
                    break;
                case EXIT:
                    System.out.println("Thanks for the game! Hope to see you soon:)");
                    scanner.close();
                    break;
                default:
                    System.out.println("There is no such an option. Please try again! ");
            }
        }
        scanner.close();
    }

    private void entryToTheGame() {
        System.out.println("Welcome in the \"Sudoku Game\". What is your name?");
        String name = "";
        boolean error = true;
        while(error) {
            System.out.println("Please type your name...");
            name = scanner.nextLine();
            error = false;
            if (name.matches(".*\\d+.*")) {
                error = true;
                System.out.println("You can't use digits when it comes to your name! Please try again!");}
        }
        System.out.println("Hello " + name + ". Let's begin");
        System.out.println("Initializing the new board.........");
        board.setNewBoard();
        System.out.println(board);
        System.out.println("Please fill in your digits in the Sudoku Board!");
    }

    private void displayTheOptions() {
        System.out.println(" Please type \"ADD\" to place your own numbers");
        System.out.println(" or type \"SUDOKU\" to solve the game,");
        System.out.println(" or type \"NEW\" to start again,");
        System.out.println(" or please press \"X\" to exit the game.");
    }
}




