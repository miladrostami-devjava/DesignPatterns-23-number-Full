package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.type("milad");
         editor.type(", rostami");
        editor.save();
        editor.undo();
//        editor.type(", java");
//        editor.save();
//        editor.undo();
//        editor.redo();
//        editor.type(", developer");
//        editor.save();
        System.out.println(editor.getCurrentContent());
    }
}
