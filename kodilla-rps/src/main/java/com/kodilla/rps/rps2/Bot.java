package com.kodilla.rps.rps2;

import java.util.Random;

public class Bot {
    private Option option;
    private Random random;

    public Bot() {
        random = new Random();
    }

    public Option move() {
        this.option = Option.createFromInt(random.nextInt(3) + 1);
        return option;
    }

    public void showMove() {
        System.out.println("Computer chose " + option + ". ");
    }
}
