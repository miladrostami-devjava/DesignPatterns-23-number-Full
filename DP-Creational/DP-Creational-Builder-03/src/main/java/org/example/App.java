package org.example;

import org.example.withLombok.Email;
import org.example.withLombok.EmailBuilderImp;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
/*Email email = new EmailBuilderImp()
        .setSender("milad")
        .setReceiver("reza")
        .setSubject("java devs")
        .setBody("total body")
                .build();*/

        Email email = Email.builder()
                .sender("milad")
                .receiver("javad")
                .subject("rmr")
                .body("tmt")
                .build();
        System.out.println("email is " + email);
    }
}
