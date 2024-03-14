package org.example.withLombok;


import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Email {
    private String sender;
    private String receiver;
    private String subject;
    private String body;


}
