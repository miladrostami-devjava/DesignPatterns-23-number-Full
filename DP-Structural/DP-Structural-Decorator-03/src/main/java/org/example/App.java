package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
TextEditor basicTextEditor =
        new SpellCorrect(
                new AutoCorrect(
                        new BasicTextEditor()
                ));

basicTextEditor.type("text editor for decorator design pattern!!!");



    }
}
