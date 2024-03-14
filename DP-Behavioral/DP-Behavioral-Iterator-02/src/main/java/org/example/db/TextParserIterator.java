package org.example.db;

public class TextParserIterator implements ParserIterator{
private final String[] tokens;
private int currentPosition;

    public TextParserIterator(String input) {
        this.tokens = input.split(" ");
        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < tokens.length;
    }

    @Override
    public String next() {
        if (hasNext()){
            /*String token = tokens[currentPosition];
            currentPosition++;
            return token;*/
            return tokens[currentPosition++];
        }
        throw new IllegalArgumentException("no more token available!");
    }
}
