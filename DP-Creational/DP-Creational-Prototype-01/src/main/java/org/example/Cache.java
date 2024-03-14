package org.example;

import java.util.HashMap;

public class Cache implements Cloneable {
    private HashMap<String, String> cachedData;

    public Cache() {
        cachedData = new HashMap<>();
    }

    private void loadDataFromDataBase(String key) {
        //simulate fetching data from database
        //key:value => name:milad
        //          => family:rostami
        //select value from table database where key=key;
        String data = "Data for key : " + key;
        cachedData.put(key, data);
    }

    public String getData(String key) {
        if (!cachedData.containsKey(key)) {
            loadDataFromDataBase(key);
        }
        return cachedData.get(key);
    }


    @Override
    public Cache clone() {
        try {
            Cache clone = (Cache) super.clone();
            // TODO: copy mutable state here,
            //  so the clone can't change the internals of the original
            clone.cachedData = (HashMap<String, String>) this.cachedData.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
