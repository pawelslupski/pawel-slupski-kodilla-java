package data;

import java.util.ArrayList;
import java.util.List;

public final class SudokuBoard extends Prototype {
    public final static int SIZE = 9;
    public final static int MIN_ROW_INDEX = 0;
    public final static int MAX_ROW_INDEX = SIZE - 1;
    public final static int MIN_COL_INDEX = 0;
    public final static int MAX_COL_INDEX = SIZE - 1;

    private List<SudokuRow> sudokuRows;

    public SudokuBoard() {
        sudokuRows = new ArrayList<>();
    }

    public List<SudokuRow> setNewBoard() {
        for (int i = MIN_ROW_INDEX; i <= MAX_ROW_INDEX; i++) {
            sudokuRows.add(i, new SudokuRow());
            for (int j = MIN_COL_INDEX; j <= MAX_COL_INDEX; j++) {
                getSudokuRows().get(i).getElements().add(j, new SudokuElement());
            }
        }
        return sudokuRows;
    }

    public void setTheElement(int row, int col, int value) {
        getSudokuRows().get(row).getElements().get(col).setValue(value); }

    public List<SudokuRow> getSudokuRows() {
        return sudokuRows; }

    public SudokuBoard shallowCopy() throws CloneNotSupportedException {
        return (SudokuBoard)super.clone(); }

    protected SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedSudokuBoard = (SudokuBoard)super.clone();
        clonedSudokuBoard.sudokuRows = new ArrayList<>();
        for(SudokuRow theSudokuRow: sudokuRows) {
            SudokuRow clonedSudokuRow = new SudokuRow();
            for(SudokuElement sudokuElement: theSudokuRow.getElements()) {
                clonedSudokuRow.getElements().add(sudokuElement);
            }
            clonedSudokuBoard.getSudokuRows().add(clonedSudokuRow);
        }
        return clonedSudokuBoard;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("-------------------------------------");
        stringBuilder.append("\n");
        for (int i = MIN_ROW_INDEX; i <= MAX_ROW_INDEX; i++) {
            stringBuilder.append("|");
            for (int j = MIN_COL_INDEX; j <= MAX_COL_INDEX; j++) {
                stringBuilder.append(" ");
                stringBuilder.append(getSudokuRows().get(i).getElements().get(j).toString());
                stringBuilder.append(" ");
                stringBuilder.append("|");
            }
            stringBuilder.append("\n");
            stringBuilder.append("-------------------------------------");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
