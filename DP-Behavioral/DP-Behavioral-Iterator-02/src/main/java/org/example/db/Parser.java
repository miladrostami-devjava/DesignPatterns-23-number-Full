package org.example.db;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    private final ParserIterator iterator;

    public Parser(String input) {
        this.iterator = new TextParserIterator(input);

    }

   /* public void parse(){
        while (iterator.hasNext()){
            String token = iterator.next();
            System.out.println("Token :" + token);
        }
    }*/
   public List<String> parse(){
       List<String> tokens = new ArrayList<>();
       while (iterator.hasNext()){
           String token = iterator.next();
           tokens.add(token);
         //  System.out.println("Token :" + token);
       }
       return tokens;
   }



}
