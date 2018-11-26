package data;

import java.util.ArrayList;
import java.util.List;

public final class SudokuRow {
    private final List<SudokuElement> elements = new ArrayList<>();

    public SudokuRow() {}

    public List<SudokuElement> getElements() {
        return elements; }
}

