package org.example;

import factory.ConvertFactory;
import models.Converter;
import models.JsonConverter;
import models.XMLConverter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConvertFactory factory = new ConvertFactory();

//        Converter xmlConverter = new XMLConverter();
//        Converter jsonConverter = new JsonConverter();
        Converter xmlConverter = factory.converter("xml");
        Converter jsonConverter = factory.converter("json");

        String xml = xmlConverter.convert("{\"name \" : \"Milad\"}");
        String json = jsonConverter.convert("<name>Milad</name>");



    }
}
