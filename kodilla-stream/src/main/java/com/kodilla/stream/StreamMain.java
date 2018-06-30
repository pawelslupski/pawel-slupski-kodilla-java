package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

import static jdk.nashorn.internal.objects.NativeString.*;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Kolejny piekny dzien z Java:P. ", "Udekorujmy ten tekst.",
                (firstWriting, secondWriting) -> ("ABC " + firstWriting + secondWriting + " ABC"));
        poemBeautifier.beautify("Kolejny piekny dzien z Java:P. ", "Udekorujmy ten tekst.",
                (firstWriting, secondWriting) -> toUpperCase( firstWriting + secondWriting));
        poemBeautifier.beautify("Kolejny piekny dzien z Java:P. ", "Udekorujmy ten tekst.",
                (firstWriting, secondWriting) -> toLowerCase( firstWriting + secondWriting));
        poemBeautifier.beautify("Kolejny piekny dzien z Java:P. ", "Udekorujmy ten tekst.",
                (firstWriting, secondWriting) -> firstWriting.replace("piekny", "brzydki"));
        poemBeautifier.beautify("Kolejny piekny dzien z Java:P. ", "Udekorujmy ten tekst.",
                (firstWriting, secondWriting) -> firstWriting.trim());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
