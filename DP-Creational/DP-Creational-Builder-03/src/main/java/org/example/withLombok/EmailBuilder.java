package org.example.withLombok;

public interface EmailBuilder {
    EmailBuilder setSender(String sender);
    EmailBuilder setReceiver(String receiver);
    EmailBuilder setSubject(String subject);
    EmailBuilder setBody(String body);
    Email build();




}
