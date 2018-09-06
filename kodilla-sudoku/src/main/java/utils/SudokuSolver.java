package utils;

import data.SudokuBoard;
import data.SudokuElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SudokuSolver {
    private SudokuBoard board;

    public SudokuSolver(SudokuBoard board) {
        this.board = board;
    }

    public void fillTheBoard() {
        for(int x = 0; x < 9; x++) {
            fillTheRow(x);
        }
    }

    private void fillTheRow(int x) {
        //fill int the "x" row with particular unique digits
        //creating ArrayList of Possible Digits
        List<SudokuElement> elementsInTheRow = new ArrayList<>();
        for (int n = 0; n < 9; n++) {
            elementsInTheRow.add(new SudokuElement(n + 1));
        }
        for (int y = 0; y < 9; y++) {
            //checking the row for digits that already exist and removes those chosen by player
            if (board.getElement(x, y) != null) {
                SudokuElement chosenElement = board.getElement(x, y);
                Iterator<SudokuElement> iter = elementsInTheRow.iterator();
                while (iter.hasNext()) {
                    SudokuElement element = iter.next();
                    if (element.getValue() == chosenElement.getValue()) {
                        iter.remove();
                    }
                }
            }
        }
        //filling the row with shuffled digits
        while (elementsInTheRow.size() > 0) {
            Collections.shuffle(elementsInTheRow);
            for (int y = 0; y < 9; y++) {
                SudokuElement currentElement = elementsInTheRow.get(0);
                if (board.getElement(x, y) == null) {
                    board.setElement(currentElement, x, y);
                    System.out.println(board);
                    elementsInTheRow.remove(currentElement);
                }
            }
        }
    }
}