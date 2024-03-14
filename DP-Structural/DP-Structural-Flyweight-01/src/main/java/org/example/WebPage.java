package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;

public class WebPage implements Tab{
    private String url;
    private String content;

    public WebPage(String url) {
        this.url = url;
        System.out.println("Loading Webpage...");
        try {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            StringBuilder contentBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null ){
                contentBuilder.append(line);
            }
            reader.close();
           this.content = contentBuilder.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void displayContent() {
        System.out.println("display content...");
        System.out.println(this.content);
    }
}
