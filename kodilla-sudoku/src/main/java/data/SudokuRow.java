package data;

import java.util.ArrayList;
import java.util.List;

public final class SudokuRow {
    private final int rowIndex;
    private final List<SudokuElement> elements = new ArrayList<>();

    public SudokuRow(final int rowIndex) {
        this.rowIndex = rowIndex;
        for (int i = 0; i < 9; i++) {
            elements.add(i, new SudokuElement(SudokuElement.EMPTY, rowIndex, i));
        }
    }

    public List<SudokuElement> getElements() {
        return elements;
    }

}

