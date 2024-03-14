package org.example;

import org.example.dp.DocumentTemplate;

public class Contract extends DocumentTemplate {
    @Override
    protected String createHeader() {
        return ">>>>>Contract<<<<<<";
    }

    @Override
    protected String createContent() {
        String clientDetails  = "Client abc company, in usa";
        String terms = "Term and condition";
        int duration = 30;
        String author = "direct manager abc company";

        return "client detail :" + clientDetails + "\n term is :" + terms
                + "\n duration is :" + duration + "\n author :" + author;
    }

    @Override
    protected String createFooter() {
        return "Please sign and return";
    }
}
