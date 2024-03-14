package org.example;

import org.example.font.Arial;
import org.example.font.TimesNewRoman;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private static final Map<String,Font> fontMap = new HashMap<>();


//note ::: lazy method
    public static Font getFont(String name){
        Font font = fontMap.get(name);
        if (font == null){
            if (name.equalsIgnoreCase("Arial")){
                font = new Arial();
            } else if (name.equalsIgnoreCase("TimesNewRoman")) {
                font = new TimesNewRoman();
            }
            fontMap.put(name,font);
        }
        return font;
    }


}
