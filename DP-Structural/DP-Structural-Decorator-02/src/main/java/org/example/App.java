package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
WebServer webServer = new WebServer();
AuthenticationMiddleWare middleWare = new AuthenticationMiddleWare(webServer);
LoggingCheck loggingCheck = new LoggingCheck(middleWare);
loggingCheck.handleRequest("https://youtube.com/mahersho");

    }
}
