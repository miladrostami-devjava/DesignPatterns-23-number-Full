package org.example;

import org.example.dp.WebPageScraper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
String url = "https://holosen.net/design-pattern/";
        WebPageScraper scraper = new WebPageScraper(url);
        for (String link:scraper) {
            System.out.println(link);
        }


    }
}
