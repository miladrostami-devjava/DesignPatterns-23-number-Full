package org.example;

import org.example.facade.DocumentGeneratorFacade;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String content = " facade design patterns in java ";

        DocumentGeneratorFacade facade = new DocumentGeneratorFacade();
        facade.setExcelGenerator(content);
        facade.setPdfGenerator(content);
        facade.setWordGenerator(content);

    }
}
