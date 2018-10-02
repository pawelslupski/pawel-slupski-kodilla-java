package data;

public final class SudokuElement {
    public final static int EMPTY = 0;
    private int value = EMPTY;

    public SudokuElement() {}

    public int getValue() {
        return value;}


    public void setValue(int value) {
        this.value = value; }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

}
