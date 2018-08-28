import org.junit.Test;

public class TestSudoku {
    @Test
    public void testSudokuElement() {
        SudokuElement sudokuElement = new SudokuElement(9);
        Board board = new Board();
        board.setSudokuElement(new SudokuElement(1), 3, 5);
        System.out.println(board);


    }
}
