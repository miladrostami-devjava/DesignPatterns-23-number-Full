package org.example;

import java.util.Stack;

public class TextEditor {
    private TextDocument currentDocument;
    private Stack<TextDocument> undoHistory;
    private Stack<TextDocument> redoHistory;

    public TextEditor() {
        currentDocument = new TextDocument("");
        undoHistory = new Stack<>();
        redoHistory = new Stack<>();

    }

    public void type(String text) {
        undoHistory.push(currentDocument.clone());
        currentDocument.setContent(currentDocument.getContent() + text);
        redoHistory.clear();
    }

    public String getCurrentContent() {
        return currentDocument.getContent();
    }


    public void save() {
undoHistory.push(currentDocument.clone());
    }

    public void undo() {
if (!undoHistory.empty()){
    redoHistory.push(currentDocument.clone());
    currentDocument = undoHistory.pop().clone();
}

    }

    public void redo() {
if (!redoHistory.empty()){
    undoHistory.push(currentDocument.clone());
    currentDocument = redoHistory.pop().clone();
}

    }
}
