package data;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    public final static int MIN_ROW_INDEX = 0;
    public final static int MIN_COLUMN_INDEX = 0;
    public final static int MAX_ROW_INDEX = 9;
    public final static int MAX_COLUMN_INDEX = 9;
    private List<SudokuRow> sudokuRows = new ArrayList<>();

    public SudokuBoard() {
        for(int i = MIN_ROW_INDEX; i < MAX_ROW_INDEX; i++) {
            sudokuRows.add(new SudokuRow(i));
        }
    }

    public List<SudokuRow> getSudokuRows() {
        return sudokuRows;
    }

    public SudokuElement getSudokuElement(int row, int column) {
        return sudokuRows.get(row).getElements().get(column);    }

    public void setElement(int value, int row, int column) {
        sudokuRows.get(row).getElements().get(column).setValue(value);
        sudokuRows.get(row).getElements().get(column).setRow(row);
        sudokuRows.get(row).getElements().get(column).setColumn(column);
        sudokuRows.get(row).getElements().get(column).setBlock();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = MIN_ROW_INDEX; i < MAX_ROW_INDEX; i++) {
            for (int j = MIN_COLUMN_INDEX; j < MAX_COLUMN_INDEX; j++) {
                stringBuilder.append(getSudokuRows().get(i).getElements().get(j).getValue());
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
