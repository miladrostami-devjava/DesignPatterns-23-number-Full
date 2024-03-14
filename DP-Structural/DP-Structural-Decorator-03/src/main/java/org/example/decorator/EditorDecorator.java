package org.example.decorator;


import org.example.TextEditor;

public  class EditorDecorator implements TextEditor {
    private final TextEditor textEditor;

    public EditorDecorator(TextEditor textEditor) {
        this.textEditor = textEditor;
    }


    @Override
    public void type(String text) {
     textEditor.type(text);
    }
}
