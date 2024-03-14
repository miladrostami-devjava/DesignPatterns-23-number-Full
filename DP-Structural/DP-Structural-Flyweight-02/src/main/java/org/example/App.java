package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = new Logger();
        logger.log(LogLevel.INFO,"this is information message");
        logger.log(LogLevel.ERROR,"this is ERROR message");
        logger.log(LogLevel.DEBUG,"this is DEBUG message");
        logger.log(LogLevel.WARNING,"this is WARNING message");



    }
}
