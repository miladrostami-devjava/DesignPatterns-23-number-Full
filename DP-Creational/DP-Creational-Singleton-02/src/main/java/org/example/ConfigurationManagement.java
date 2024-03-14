package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

public class ConfigurationManagement {
    private static ConfigurationManagement instance;
    private final Properties properties;

    private ConfigurationManagement() {
        properties = new Properties();
        try (InputStream inputStream = getClass()
                .getResourceAsStream("config.properties")) {
            properties.load(inputStream);


        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }
    public static ConfigurationManagement getInstance(){
        if (instance == null){
            instance = new ConfigurationManagement();
        }
        return instance;
    }
    public String getProperty(String key){

        return properties.getProperty(key);
    }



}
