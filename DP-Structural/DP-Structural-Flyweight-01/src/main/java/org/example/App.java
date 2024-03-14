package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        TabFactory tabFactory = new TabFactory();
        Tab tab1 = tabFactory.getTap("https://jenkov.com/");
        Tab tab2 = tabFactory.getTap("https://github.com/");

        tab1.displayContent();
        tab2.displayContent();

        Tab tab3 = tabFactory.getTap("https://jenkov.com/");
        tab3.displayContent();
    }
}
