package org.example.font;

import org.example.Font;

public class Arial implements Font {
private final String name;

    public Arial() {
name = "Arial";
    }



    @Override
    public void render(String content) {
        //todo : load font
        System.out.println("Rendering content with  font Arial");
        System.out.println(content);
    }
}
