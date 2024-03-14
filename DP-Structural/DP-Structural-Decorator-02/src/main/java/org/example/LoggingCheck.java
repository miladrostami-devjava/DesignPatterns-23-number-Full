package org.example;

import org.example.decrator.MiddleWareDecorator;

public class LoggingCheck extends MiddleWareDecorator {
    protected LoggingCheck(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(String request) {
        applyLogging();
        super.handleRequest(request);
    }

    private void applyLogging(){
        System.out.println("applying Logging on the http request!!!");
    }
}
