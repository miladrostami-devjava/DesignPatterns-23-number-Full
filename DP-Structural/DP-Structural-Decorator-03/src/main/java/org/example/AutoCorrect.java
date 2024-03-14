package org.example;

import org.example.decorator.EditorDecorator;

public class AutoCorrect extends EditorDecorator {
    public AutoCorrect(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void type(String text) {
        autoCorrect();
        super.type(text);
    }

    private void autoCorrect() {
        System.out.println("apply auto correct!!!");
    }
}
