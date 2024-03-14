package org.example;

import org.example.builder.ContactUsFormBuilder;
import org.example.interfaces.Form;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Form formUs = new ContactUsFormBuilder()
                .setFirstName("milad")
                .setLastName("rostami")
                .setEmail("miladrostami@gmail.com")
                .build();

        System.out.println("my form :" + formUs);
    }
}
