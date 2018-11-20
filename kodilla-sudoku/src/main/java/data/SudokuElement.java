package data;

public final class SudokuElement {
    public final static int EMPTY = 0;
    private int value = EMPTY;

    public SudokuElement() {}

    public int getValue() {
        return value;}

    public void setValue(int value) {
        if (value >= 0) {
            this.value = value;
        } else {
            System.out.println("Value has to be positive");
        }
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
