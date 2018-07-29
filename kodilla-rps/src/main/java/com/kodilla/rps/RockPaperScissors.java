package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private Scanner scanner;
    private Random random;
    private String name;
    private int rounds;
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    public RockPaperScissors() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void entryToTheGame() {
        System.out.println("Welcome in the \"Rock, Paper, Scissors Game\". What is your name?");
        String name = scanner.nextLine();
        this.name = name;
        System.out.println("Hello " + name + ". To how many winning rounds would you like to play?");
        int rounds = scanner.nextInt();
        this.rounds = rounds;
        System.out.println("Ok then! " + rounds + " rounds will appoint the winner. Let's begin:)");
    }

    public void playTheGame() throws IllegalStateException {
        boolean end = false;
        int playerCounter = 0;
        int computerCounter = 0;

        while (!end) {
            System.out.println("Please press one of the following: \n" +
                    "1 - if you choose " + ROCK + "\n" +
                    "2 - if you choose " + PAPER + "\n" +
                    "3 - if you choose " + SCISSORS + "\n" +
                    "x - if you want to quit \n" +
                    "n - if you want to start all over");

            char playerChar = scanner.next().charAt(0);
            int computerInt = random.nextInt(3) + 1;

            if (playerChar == '1') {
                System.out.println("You chose " + ROCK + "!");
                if (computerInt == 1) {
                    System.out.println("Computer chose " + ROCK + "! It's a tie:/");
                } else if (computerInt == 2) {
                    System.out.println("Computer chose " + PAPER + "! You lost:(");
                    computerCounter++;
                } else if (computerInt == 3) {
                    System.out.println("Computer chose " + SCISSORS + "! You won:)");
                    playerCounter++;
                }
            } else if (playerChar == '2') {
                System.out.println("You chose " + PAPER + "!");
                if (computerInt == 1) {
                    System.out.println("Computer chose " + ROCK + "! You won:)");
                    playerCounter++;
                } else if (computerInt == 2) {
                    System.out.println("Computer chose " + PAPER + "! It's a tie:/");
                } else if (computerInt == 3) {
                    System.out.println("Computer chose " + SCISSORS + "! You lost:(");
                    computerCounter++;
                }
            } else if (playerChar == '3') {
                System.out.println("You chose " + SCISSORS + "!");
                if (computerInt == 1) {
                    System.out.println("Computer chose " + ROCK + "! You lost:(");
                    computerCounter++;
                } else if (computerInt == 2) {
                    System.out.println("Computer chose " + PAPER + "!  You won:)");
                    playerCounter++;
                } else if (computerInt == 3) {
                    System.out.println("Computer chose " + SCISSORS + "! It's a tie:/");
                }
            } else if (playerChar == 'x') {
                System.out.println("Are you sure you want to quit the game?. Click \"y\" or \"n\".");
                char yesOrNo = scanner.next().charAt(0);
                if (yesOrNo == 'y') {
                    System.out.println("See you next time!");
                    end = true;
                } else if (yesOrNo == 'n') {
                    System.out.println("Let's continue.");
                }
            } else if (playerChar == 'n') {
                System.out.println("Are you sure you finish current play and start again?. Click \"y\" or \"n\".");
                char yesOrNo = scanner.next().charAt(0);
                if (yesOrNo == 'y') {
                    System.out.println("Let's start again!");
                    playerCounter = 0;
                    computerCounter = 0;
                } else if (yesOrNo == 'n') {
                    System.out.println("Let's carry on");
                }
            } else {
                System.out.println("Sorry you can only type \"1\", \"2\", \"3\"," +
                        " \"x\" or \"n\". \nTry again!");
            }
            System.out.println("Your score:" + playerCounter + " vs Computer score:" + computerCounter);

            if (playerCounter >= rounds || computerCounter >= rounds) {
                System.out.println("The game is over");
                if (playerCounter > computerCounter) {
                    System.out.println("Congratulations you won the game:)");
                } else {
                    System.out.println("Sorry but you lost the game:(");
                }

                boolean askAgain = false;
                while (!askAgain) {
                    System.out.println("Press \"n\" if you feel like playing again or \"x\" if you prefer to quit");
                    char againOrQuit = scanner.next().charAt(0);
                    if (againOrQuit == 'x') {
                        System.out.println("Are you sure you want to quit the game?. Click \"y\" or \"n\".");
                        char yesOrNo = scanner.next().charAt(0);
                        if (yesOrNo == 'y') {
                            System.out.println("See you next time!");
                            askAgain = true;
                            end = true;
                        } else if (yesOrNo == 'n') {
                            System.out.println("Let's start again");
                            playerCounter = 0;
                            computerCounter = 0;
                            askAgain = true;
                        }
                    } else if (againOrQuit == 'n') {
                        System.out.println("Are you sure you want start again?. Click \"y\" or \"n\".");
                        char yesOrNo = scanner.next().charAt(0);
                        if (yesOrNo == 'y') {
                            System.out.println("Let's start again!");
                            playerCounter = 0;
                            computerCounter = 0;
                            askAgain = true;
                        } else if (yesOrNo == 'n') {
                            System.out.println("Thanks for the game:)");
                            askAgain = true;
                            end = true;
                        }
                    } else {
                        System.out.println("Sorry you can only type \"x\" or \"n\". \nTry again!");
                    }
                }
            }
        }

    }
}
