package org.example;

public class BasicTextEditor implements TextEditor{
    @Override
    public void type(String text) {
        System.out.println("editing run:" + " " + text);
    }
}
