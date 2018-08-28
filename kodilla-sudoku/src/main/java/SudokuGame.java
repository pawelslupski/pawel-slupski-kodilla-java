import java.util.Random;
import java.util.Scanner;

public class SudokuGame {
    Board board = new Board();
    private Scanner scanner;
    private Random random;

    public SudokuGame() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void entryToTheGame() {
        System.out.println("Welcome in the \"Sudoku Game\". What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ". Let's begin");
        System.out.println("Initializing the empty board.........");
        System.out.println(board);
    }

    public void playTheGame() {
        System.out.println("Please fill in your digits in the Sudoku Board!");
        System.out.println("Please type the value (1-9), first coordinate(row 0-8)," +
                " second coordinate(column 0-8) in the right format namely [1-9,0-8,0-8]");
        String inputLine = scanner.nextLine();
        int value = Integer.parseInt(inputLine.substring(0,1));
        int row = Integer.parseInt(inputLine.substring(2,3));
        int column = Integer.parseInt(inputLine.substring(4,5));
        board.setSudokuElement(new SudokuElement(value), row, column);
        System.out.println(board);
    }
}
