package org.example;

import org.example.decorator.EditorDecorator;

public class SpellCorrect extends EditorDecorator {


    public SpellCorrect(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void type(String text) {
        spellCorrect();
        super.type(text);
    }

    private void spellCorrect() {
        System.out.println("apply spellCorrect !!!");
    }
}

