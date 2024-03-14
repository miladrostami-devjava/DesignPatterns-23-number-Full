package org.example;

import org.example.db.Parser;
import org.example.db.TextParserIterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        TextParserIterator parser = new TextParserIterator("parser the text for test ! .");

String input = "sample text for test ! .";
        Parser parser = new Parser(input);
        System.out.println(parser.parse());
    }
}
