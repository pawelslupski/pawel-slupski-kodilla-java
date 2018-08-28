public class Board {
    private final static int MIN_INDEX = 0;
    private final static int MAX_INDEX = 8;
    SudokuElement[][] board;

    public Board() {
        board = new SudokuElement[9][9];
    }

    public SudokuElement getSudokuElement(int x, int y) {
        return board[x][y];
    }

    public void setSudokuElement(SudokuElement sudokuElement, int x, int y) {
        if (sudokuElement.getValue() == 0) {
            throw new IllegalStateException("Sorry but you can only type digits from 1-9 range!");
        } else {
            board[x][y] = sudokuElement;
        }
    }

    public String toString() {
        String result = "";
        for(int i = MIN_INDEX; i <= MAX_INDEX; i++) {
            for(int j = MIN_INDEX; j <= MAX_INDEX; j++) {
                if(board[i][j] == null) {
                    result += "|";
                } else if(board[i][j].getValue() == SudokuElement.EMPTY) {
                    result += "0";
                } else if(board[i][j].getValue() > 0 && board[i][j].getValue() <= 9) {
                    result += Integer.toString(board[i][j].getValue());
                } else {
                    throw new IllegalStateException("Technical problem! Board couldn't be displayed!");
                }
            }
            result += "\n";
        }
        return result;
    }
}
