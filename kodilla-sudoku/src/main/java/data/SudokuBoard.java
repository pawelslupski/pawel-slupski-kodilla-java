package data;

public class SudokuBoard {
    //intitial board 9x9
    public static final int MIN_INDEX = 0;
    public static final int MAX_INDEX = 8;
    private SudokuElement[][] board;

    public SudokuBoard() {
        board = new SudokuElement[9][9];
    }

    public SudokuElement getElement(int row, int column) {
        return board[row][column];
    }

    public void setElement(SudokuElement element, int x, int y) {
        if (element.getValue() >= SudokuElement.MIN_DIGIT && element.getValue() <= SudokuElement.MAX_DIGIT) {
            board[x][y] = element;
        } else if (element.getValue() == SudokuElement.EMPTY) {
            board[x][y] = null;
        } else {
            throw new IllegalStateException("Sorry but you can only type digits from 1-9 range!");
        }
    }

    public String toString() {
        String result = "";
        for (int i = MIN_INDEX; i <= MAX_INDEX; i++) {
            for (int j = MIN_INDEX; j <= MAX_INDEX; j++) {
                if (board[i][j] == null) {
                    result += "|";
                } else if (board[i][j].getValue() >= SudokuElement.MIN_DIGIT &&
                        board[i][j].getValue() <= SudokuElement.MAX_DIGIT) {
                    result += Integer.toString(board[i][j].getValue());
                } else {
                    throw new IllegalStateException("Technical problem! SudokuBoard couldn't be displayed!");
                }
            }
            result += "\n";
        }
        return result;
    }
}



