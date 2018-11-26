package com.kodilla.rps.rps2;

public enum Option {
    EXIT(0, "EXIT the game"),
    ROCK(1, "Choose ROCK"),
    PAPER(2,"Choose PAPER"),
    SCISSORS(3, "Choose SCISSORS"),
    AGAIN(4, "Start AGAIN");

    private int value;
    private String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static Option createFromInt(int option) {
        return Option.values()[option];
    }
}
