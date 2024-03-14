package org.example;

import org.example.logger.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = Logger.getLogger();

        logger.log(LogLevel.INFO,"this is an information message");
        logger.log(LogLevel.WARNING,"this is a warning message");
        logger.log(LogLevel.ERROR,"this is an error message");

    }
}
