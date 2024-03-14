package org.example;

import java.util.HashMap;
import java.util.Map;

public class TabFactory {

    private Map<String ,Tab> tabs;

    public TabFactory() {
        tabs = new HashMap<>();
    }
public Tab getTap(String url){
        Tab tab = tabs.get(url);
        if (tab == null){
            tab = new WebPage(url);
            tabs.put(url,tab);
        }
return tab;
}

}
