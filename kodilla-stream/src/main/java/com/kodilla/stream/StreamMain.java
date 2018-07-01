package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Kolejny piekny dzien z Java:P. ", "Udekorujmy ten tekst.",
                (firstWriting, secondWriting) -> ("ABC " + firstWriting + secondWriting + " ABC"));
        poemBeautifier.beautify("Kolejny piekny dzien z Java:P. ", "Udekorujmy ten tekst.",
                (firstWriting, secondWriting) -> ( firstWriting + secondWriting).toUpperCase());
        poemBeautifier.beautify("Kolejny piekny dzien z Java:P. ", "Udekorujmy ten tekst.",
                (firstWriting, secondWriting) -> ( firstWriting + secondWriting).toLowerCase());
        poemBeautifier.beautify("Kolejny piekny dzien z Java:P. ", "Udekorujmy ten tekst.",
                (firstWriting, secondWriting) -> firstWriting.replace("piekny", "brzydki"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
