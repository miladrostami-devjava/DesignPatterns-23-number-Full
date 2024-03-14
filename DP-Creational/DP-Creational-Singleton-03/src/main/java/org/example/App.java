package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
Logger logger = Logger.getInstance();
logger.log(LogLevel.DEBUG,"hello java developer");
logger.log(LogLevel.ERROR,"i am java dev");

logger.getAllLogs().forEach(System.out::println);

    }
}
