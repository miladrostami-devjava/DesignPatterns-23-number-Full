package org.example;

import org.example.decrator.MiddleWareDecorator;

public class AuthenticationMiddleWare extends MiddleWareDecorator {
    protected AuthenticationMiddleWare(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(String request) {
        applyAuth();
        super.handleRequest(request);
    }

    private void applyAuth(){
        System.out.println("applying AuthenticationMiddleWare on the http request!!!");
    }
}
