package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String firstWriting, String secondWriting, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(firstWriting, secondWriting);
        System.out.println(result);
    }
}
