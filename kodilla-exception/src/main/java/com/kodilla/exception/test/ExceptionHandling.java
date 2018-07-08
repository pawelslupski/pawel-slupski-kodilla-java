package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] arg) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1, 1.5);
        } catch (Exception e) {
            System.out.println("Problem while processing the method due to wrong value of arguments. " +
            "Exception: \"" + e.toString() + "\" has been detected.");
        } finally {
            System.out.println("All exceptions have been successfully handled after all:).");
        }

    }
}
