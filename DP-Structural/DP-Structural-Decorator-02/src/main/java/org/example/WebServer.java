package org.example;

public class WebServer implements RequestHandler{
    @Override
    public void handleRequest(String request) {
        System.out.println("handling the request .." + " " + request);
    }
}
