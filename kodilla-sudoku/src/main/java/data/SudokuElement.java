package data;

import java.util.ArrayList;
import java.util.List;

public final class SudokuElement {
    public static final int EMPTY = 0;
    public static final int MIN_DIGIT = 1;
    public static final int MAX_DIGIT = 9;
    private int value;
    private final List<Integer> listOfPossibleDigitsInElement;

    public SudokuElement(int value) {
        listOfPossibleDigitsInElement = new ArrayList<>();
        for (int i = MIN_DIGIT; i <= MAX_DIGIT; i++) {
            listOfPossibleDigitsInElement.add(i);}

        if (value == EMPTY || listOfPossibleDigitsInElement.contains(value)) {
            this.value = value;
        } else {
            throw new IllegalStateException("Wrong digit! You can only choose a digit from 1-9 range!");
        }
    }

    public int getValue() {
        return value;
    }
}