package com.kodilla.rps.rps2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    Bot bot;
    Player player;
    private Scanner scanner;
    private Random random;
    private int rounds;
    public static final String TIE = "It's a tie";
    public static final String WINNING = "You won!:)";
    public static final String LOOSING = "You lost!:(";
    public static final int ZERO = 0;
    public static final char QUIT = 'Q';
    public static final char AGAIN = 'A';


    public RockPaperScissors() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.bot = new Bot();
        this.player = new Player();
    }

    private void entryToTheGame() {
        System.out.println("Welcome in the \"Rock, Paper, Scissors Game\". What is your name?");
        player.setName(scanner.nextLine());
        System.out.println("Hello " + player.getName() + ". To how many winning rounds would you like to play?");
        boolean error = true;
        while (error) {
            try {
                rounds = scanner.nextInt();
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Incorrect type of input! Please use numbers only!");
                scanner.nextLine();
            }
        }
        System.out.println("Ok then! " + rounds + " rounds will appoint the winner. Let's begin:)");
    }

    private void printOptions() {
        System.out.println("Choose the option: ");
        for (Option o : Option.values()) {
            System.out.println(o.getValue() + " - " + o.getDescription());
        }
    }

    private boolean checkIfFinished(int rounds, int playerCounter, int botCounter) {
        if (playerCounter >= rounds || botCounter >= rounds) {
            System.out.println("The game is over");
            if (playerCounter > botCounter) {
                System.out.println("Congratulations you won the game:)");
            } else {
                System.out.println("Sorry but you lost the game:(");
            }
            return true;
        }
        return false;
    }

    public void playTheGame() {
        entryToTheGame();
        boolean end = false;
        int playerCounter = 0;
        int botCounter = 0;

        while (!end) {
            printOptions();
            Option option = player.move(scanner);
            switch (option) {
                case ROCK:
                    if (bot.move().equals(Option.ROCK)) {
                        bot.showMove();
                        System.out.println(TIE);
                    } else if (bot.move().equals(Option.PAPER)) {
                        bot.showMove();
                        System.out.println(LOOSING);
                        botCounter++;
                    } else {
                        bot.showMove();
                        System.out.println(WINNING);
                        playerCounter++;
                    }
                    break;
                case PAPER:
                    if (bot.move().equals(Option.ROCK)) {
                        bot.showMove();
                        System.out.println(WINNING);
                        playerCounter++;
                    } else if (bot.move().equals(Option.PAPER)) {
                        bot.showMove();
                        System.out.println(TIE);
                    } else {
                        bot.showMove();
                        System.out.println(LOOSING);
                        botCounter++;
                    }
                    break;
                case SCISSORS:
                    if (bot.move().equals(Option.ROCK)) {
                        bot.showMove();
                        System.out.println(LOOSING);
                        botCounter++;
                    } else if (bot.move().equals(Option.PAPER)) {
                        bot.showMove();
                        System.out.println(WINNING);
                        playerCounter++;
                    } else {
                        bot.showMove();
                        System.out.println(TIE);
                    }
                    break;
                case AGAIN:
                    System.out.println("Are you sure you finish current play and start again?. Type \"y\" or \"n\".");
                    char yesOrNo = scanner.next().charAt(ZERO);
                    if (yesOrNo == 'y') {
                        System.out.println("Let's start again!");
                        playerCounter = ZERO;
                        botCounter = ZERO;
                    } else if (yesOrNo == 'n') {
                        System.out.println("Let's carry on");
                    }
                    break;
                case EXIT:
                    System.out.println("Are you sure you want to quit the game?. Type \"y\" or \"n\".");
                    yesOrNo = scanner.next().charAt(ZERO);
                    if (yesOrNo == 'y') {
                        System.out.println("See you next time!");
                        scanner.close();
                        end = true;
                    } else if (yesOrNo == 'n') {
                        System.out.println("Let's continue.");
                    }
                    break;
                default:
                    System.out.println("Something went wrong");
            }

            System.out.println("Your score:" + playerCounter + " vs Computer score:" + botCounter);

            if(checkIfFinished(rounds, playerCounter, botCounter)) {
                boolean askAgain = true;
                while (askAgain) {
                    System.out.println("Type \"A\" if you feel like playing again or \"Q\" if you prefer to quit");
                    char againOrQuit = scanner.next().charAt(ZERO);
                    if (againOrQuit == QUIT) {
                        System.out.println("Are you sure you want to quit the game?. Click \"y\" or \"n\".");
                        char yesOrNo = scanner.next().charAt(ZERO);
                        if (yesOrNo == 'y') {
                            System.out.println("See you next time!");
                            askAgain = false;
                            end = true;
                        } else if (yesOrNo == 'n') {
                            System.out.println("Let's start again");
                            playerCounter = ZERO;
                            botCounter = ZERO;
                            askAgain = false; }
                    } else if (againOrQuit == AGAIN) {
                        System.out.println("Are you sure you want start again?. Click \"y\" or \"n\".");
                        char yesOrNo = scanner.next().charAt(ZERO);
                        if (yesOrNo == 'y') {
                            System.out.println("Let's start again!");
                            playerCounter = ZERO;
                            botCounter = ZERO;
                            askAgain = false;
                        } else if (yesOrNo == 'n') {
                            System.out.println("Thanks for the game:)");
                            askAgain = false;
                            end = true; }
                    } else {
                        System.out.println("Sorry you can only type \"A\" or \"Q\". \nTry again!");
                    }
                }
            }
        }
    }
}


