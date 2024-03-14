package org.example.db;

import java.util.Stack;

public class BrowserHistory {
private final Stack<WebPageMemento> backStack;
private final Stack<WebPageMemento> forwardStack;


    public BrowserHistory() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
    }
public void navigate(WebPage webPage,String url){
        backStack.push(webPage.save());
        forwardStack.clear();
        webPage.setCurrentPageURL(url);
}
public void goBackward(WebPage webPage){
if (!backStack.isEmpty()){
    WebPageMemento previousPage = backStack.pop();
    forwardStack.push(webPage.save());
    webPage.restore(previousPage);
}else {
    System.out.println("no previous page available!");
}

}
    public void goForward(WebPage webPage){
        if (!forwardStack.isEmpty()){
            WebPageMemento nextPage = forwardStack.pop();
            backStack.push(webPage.save());
            webPage.restore(nextPage);
        }else {
            System.out.println("no next page available!");
        }



    }

}
