package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            } else {
                System.out.println("Dzialanie jest prawidlowe.");
            }
        } catch (ArithmeticException ex) {
                System.out.println("Wykonano niewlasciwe dzialanie dzielenia / 0. " +
                        "W zwiazku z tym do mianownika automatycznie dodajemy 1 i dzielimy /1");
                return a / (b + 1);
            }
            return a / b;
        }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}