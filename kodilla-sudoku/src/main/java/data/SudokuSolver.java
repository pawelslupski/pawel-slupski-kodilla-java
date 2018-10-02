package data;

public class SudokuSolver {
    private SudokuBoard board;
    public final static int EMPTY = 0;
    public final static int SIZE = 9;
    public final static int BOX_SIZE = 3;
    public final static int MIN_VALUE = 1;
    private final static int MAX_VALUE = 9;

    public SudokuSolver(SudokuBoard board) {
        this.board = board;
    }

    // we check if a possible number is already in a row
    private boolean checkTheRow(int row, int number) {
        for (int i = 0; i < SIZE; i++)
            if (board.getSudokuRows().get(row).getElements().get(i).getValue() == number)
                return true;

        return false;
    }

    // we check if a possible number is already in a column
    private boolean checkTheCol(int col, int number) {
        for (int i = 0; i < SIZE; i++)
            if (board.getSudokuRows().get(i).getElements().get(col).getValue() == number)
                return true;

        return false;
    }

    // we check if a possible number is in its 3x3 box
    private boolean checkTheBox(int row, int col, int number) {
        int startRow = row - row % BOX_SIZE;
        int startCol = col - col % BOX_SIZE;
        for (int i = startRow; i < startRow + 3; i++)
            for (int j = startCol; j < startCol + 3; j++)
                if (board.getSudokuRows().get(i).getElements().get(j).getValue() == number)
                    return true;

        return false;
    }

    // combined method to check if a number possible to a row,col position is ok
    private boolean canSetValue(int row, int col, int number) {
        return !checkTheRow(row, number) && !checkTheCol(col, number) && !checkTheBox(row, col, number);
    }

    // Solve method. We will use a recursive BackTracking algorithm.
    // we will see better approaches in next video :)
    public boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                // we search an empty cell
                if (board.getSudokuRows().get(row).getElements().get(col).getValue() == EMPTY) {
                    // we try possible numbers
                    for (int number = MIN_VALUE; number <= MAX_VALUE; number++) {
                        if (canSetValue(row, col, number)) {
                            // number ok. it respects sudoku constraints
                            board.getSudokuRows().get(row).getElements().get(col).setValue(number);

                            if (solve()) { // we start backtracking recursively
                                return true;
                            } else { // if not a solution, we empty the cell and we continue
                                board.getSudokuRows().get(row).getElements().get(col).setValue(EMPTY);
                            }
                        }
                    }
                    return false; // we return false
                }
            }
        }
        return true; // sudoku solved
    }

}





