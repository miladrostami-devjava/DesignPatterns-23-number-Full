package org.example.dp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Iterator;

public class WebPageIterator implements Iterator<String> {
private final String url;
private Elements links;
private int currentIndex;
    public WebPageIterator(String url) {
        this.url = url;
        try {
            Document document = Jsoup.connect(url).get();
            links = document.select("a[href]");
currentIndex =0;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean hasNext() {
        return currentIndex< links.size();
    }

    @Override
    public String next() {
      Element elements =   links.get(currentIndex);
        currentIndex++;


        return elements.attr("href");
    }
}
