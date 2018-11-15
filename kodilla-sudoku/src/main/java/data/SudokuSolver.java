package data;

public class SudokuSolver {
    public final static int EMPTY = 0;
    public final static int SIZE = 9;
    public final static int BOX_SIZE = 3;
    public final static int MIN_VALUE = 1;
    private final static int MAX_VALUE = 9;
    private SudokuBoard board;

    public SudokuSolver(SudokuBoard board) {
        this.board = board;
    }

    private boolean checkTheRow(int row, int number) {
        for (int i = 0; i < SIZE; i++)
            if (board.getSudokuRows().get(row).getElements().get(i).getValue() == number)
                return true;
        return false;
    }

    private boolean checkTheCol(int col, int number) {
        for (int i = 0; i < SIZE; i++)
            if (board.getSudokuRows().get(i).getElements().get(col).getValue() == number)
                return true;
        return false;
    }

    private boolean checkTheBox(int row, int col, int number) {
        int startRow = row - row % BOX_SIZE;
        int startCol = col - col % BOX_SIZE;
        for (int i = startRow; i < startRow + 3; i++)
            for (int j = startCol; j < startCol + 3; j++)
                if (board.getSudokuRows().get(i).getElements().get(j).getValue() == number)
                    return true;
        return false;
    }

    public boolean canSetValue(int row, int col, int number) {
        return !checkTheRow(row, number) && !checkTheCol(col, number) && !checkTheBox(row, col, number) &&
                (row>=0&&row<=8) && (col>=0&&col<=8) && (number>0&&number<=9);
    }

    public boolean solve() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board.getSudokuRows().get(row).getElements().get(col).getValue() == EMPTY) {
                    for (int number = MIN_VALUE; number <= MAX_VALUE; number++) {
                        if (canSetValue(row, col, number)) {
                            board.getSudokuRows().get(row).getElements().get(col).setValue(number);
                            if (solve()) {
                                return true;
                            } else {
                                board.getSudokuRows().get(row).getElements().get(col).setValue(EMPTY);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
