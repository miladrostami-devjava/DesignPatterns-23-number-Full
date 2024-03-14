package org.example;

import org.example.db.BrowserHistory;
import org.example.db.WebPage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebPage webPage = new WebPage();
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.navigate(webPage,"https://translate.google.com/?hl=fa&sl=en&tl=fa&op=translate");
        browserHistory.navigate(webPage,"https://translate.google.com/contribute?sl=en&tl=fa&op=translate&hl=fa");
        browserHistory.navigate(webPage,"https://support.google.com/translate/?hl=fa#topic=7011755");

        browserHistory.goBackward(webPage);
        browserHistory.goBackward(webPage);
        browserHistory.goForward(webPage);

    }
}
