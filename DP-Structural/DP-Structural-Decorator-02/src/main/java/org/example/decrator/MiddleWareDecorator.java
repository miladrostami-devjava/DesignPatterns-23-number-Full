package org.example.decrator;

import org.example.RequestHandler;

public abstract class MiddleWareDecorator implements RequestHandler {
    private final RequestHandler requestHandler;

    protected MiddleWareDecorator(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override
    public void handleRequest(String request) {

        requestHandler.handleRequest(" handling run... "+ request);
    }



}
