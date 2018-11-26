package com.kodilla.rps.rps2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    private String name;

    public Player() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Option move(Scanner scanner) {
        Option option = Option.ROCK;
        boolean error = true;
        while(error) {
            try {
                option = Option.createFromInt(scanner.nextInt());
                error = false;
                System.out.println("You chose " + option + ". ");
                return option;
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException ex) {
                System.out.println("Incorrect type of input! Please use numbers 0-4 only!");
                scanner.nextLine();
            }
        }
        return option;
    }
}
