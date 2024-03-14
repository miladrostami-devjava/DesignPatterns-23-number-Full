package org.example.dp;

import java.util.Iterator;

public class WebPageScraper implements Iterable<String>{
private final String url;


    public WebPageScraper(String url) {
        this.url = url;
    }

    @Override
    public Iterator<String> iterator() {
        return new WebPageIterator(this.url);
    }
}
