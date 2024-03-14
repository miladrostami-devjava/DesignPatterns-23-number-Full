package org.example.font;

import org.example.Font;

public class TimesNewRoman implements Font {
    private final String name;

    public TimesNewRoman() {
        name = "TimesNewRoman";
    }
    @Override
    public void render(String content) {
        //todo : load font
        System.out.println("Rendering content with  font TimesNewRoman");
        System.out.println(content);
    }
}
