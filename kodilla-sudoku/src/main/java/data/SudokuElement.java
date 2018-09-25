package data;

import java.util.Objects;

public final class SudokuElement {
    public static final int EMPTY = 0;
    public static final int MIN_DIGIT = 1;
    public static final int MAX_DIGIT = 9;
    private int value;
    private int row;
    private int column;
    private int block;

    public SudokuElement(int value, int row, int column) {
        if (value == EMPTY || value >= MIN_DIGIT && value <= MAX_DIGIT) {
            this.value = value;
        } else {
            throw new IllegalStateException("Wrong digit! You can only choose a digit from 1-9 range!");
        }
        this.row = row;
        this.column = column;
        setBlock();
    }

    public int getValue() {
        return value;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public int getBlock() {
        return block;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setBlock() {
        if(row < 3) {
            if (column < 3) {
                this.block = 1;
            } else if (column >= 3 && column < 6) {
                this.block = 2;
            } else { this.block = 3; }
        } else if(row >= 3 && row < 6) {
            if (column < 3) {
                this.block = 4;
            } else if (column >= 3 && column < 6) {
                this.block = 5;
            } else { this.block = 6; }
        } else if(row >= 6 && row <9) {
            if (column < 3) {
                this.block = 7;
            } else if (column >= 3 && column < 6) {
                this.block = 8;
            } else {
                this.block = 9;
            }
        } else {
            throw new IllegalStateException("Row and Collumn has a wrong index. Couldn't calculate" +
                    "the block number");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SudokuElement element = (SudokuElement) o;
        return value == element.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "SudokuElement{" +
                "value=" + value +
                ", column=" + column +
                ", row=" + row +
                ", block=" + block +
                '}';
    }

}
