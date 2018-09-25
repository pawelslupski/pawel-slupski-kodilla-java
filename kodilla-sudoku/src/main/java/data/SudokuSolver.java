package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SudokuSolver {
    private SudokuBoard board;
    public static final int INDEX = 0;

    public SudokuSolver(SudokuBoard board) {
        this.board = board;
    }


    public void filltheBoard() {
        for (int i = 0; i < SudokuBoard.MAX_ROW_INDEX; i++) {
            if (i == 0) {
                fillTheFirstRow();
            } else {
                //fillTheRow(i); //temporarily
            }
        }
    }

    public void fillTheFirstRow() {
        List<Integer> possibleDigitsInTheRow = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            possibleDigitsInTheRow.add(i, i + 1);
        }

        List<Integer> alreadyUsed = board.getSudokuRows().get(0).getElements().stream()
                .filter(SudokuElement -> SudokuElement.getValue() != 0)
                .map(SudokuElement::getValue)
                .collect(Collectors.toList());

        if (alreadyUsed.size() > 0) {
            for (Integer k : alreadyUsed) {
                possibleDigitsInTheRow.remove(k);
            }
        }
        for (int n = 0; n < SudokuBoard.MAX_COLUMN_INDEX; n++) {
            if (board.getSudokuRows().get(0).getElements().get(n).getValue() == SudokuElement.EMPTY) {
                Collections.shuffle(possibleDigitsInTheRow);
                board.setElement(possibleDigitsInTheRow.get(0), 0, n);
                possibleDigitsInTheRow.remove(possibleDigitsInTheRow.get(0));
            } else {
                continue;
            }
        }
    }

    public void fillTheNextRow(int index) {
        List<Integer> possibleDigitsInTheRow = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            possibleDigitsInTheRow.add(i, i + 1);
        }

        List<Integer> alreadyUsed = board.getSudokuRows().get(index).getElements().stream()
                .filter(SudokuElement -> SudokuElement.getValue() != 0)
                .map(SudokuElement::getValue)
                .collect(Collectors.toList());

        if (alreadyUsed.size() > 0) {
            for (Integer k : alreadyUsed) {
                possibleDigitsInTheRow.remove(k);
            }
        }

        for (int n = 0; n < SudokuBoard.MAX_COLUMN_INDEX; n++) {
            SudokuElement currentSudokuElement = board.getSudokuRows().get(index).getElements().get(n);
            if (currentSudokuElement.getValue() == SudokuElement.EMPTY) {
                while (!checkTheColumn(n, possibleDigitsInTheRow.get(0))) {
                    Collections.shuffle(possibleDigitsInTheRow);
                }
                board.setElement(possibleDigitsInTheRow.get(0), index, n);
                possibleDigitsInTheRow.remove(possibleDigitsInTheRow.get(0));
            } else {
                continue;
            }
        }
    }

    private boolean checkTheColumn(int column, int value) {
        ArrayList<Integer> alreadyUsedInColumn = board.getSudokuRows().parallelStream()
                .flatMap(sudokuRow -> sudokuRow.getElements().parallelStream())
                .filter(SudokuElement -> SudokuElement.getColumn() == column)
                .map(SudokuElement -> SudokuElement.getValue())
                .collect(Collectors.toCollection(ArrayList::new));
        if (alreadyUsedInColumn.contains(value)) {
            return false;
        }
        return true;
    }
}

   /* private boolean checkTheBlock (int row, int column, int value) {
        SudokuElement currentSudokuElement = board.getSudokuElement(row, column);
        currentSudokuElement.setBlock();
        int currentBlock = currentSudokuElement.getBlock();

        ArrayList<Integer> alreadyUsedInBlock = board.getSudokuRows().parallelStream()
                .flatMap(sudokuRow -> sudokuRow.getElements().parallelStream())
                .filter(SudokuElement -> SudokuElement.getBlock() == currentBlock)
                .map(SudokuElement -> SudokuElement.getValue())
                .collect(Collectors.toCollection(ArrayList::new));
        if(alreadyUsedInBlock.contains(value)) {
            return false;
        }
        return true;
    }
*/




