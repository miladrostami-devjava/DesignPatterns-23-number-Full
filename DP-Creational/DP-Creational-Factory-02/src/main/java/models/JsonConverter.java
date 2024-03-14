package models;

public class JsonConverter implements Converter {

    @Override
    public String convert(String xml){
        return "JSON" + xml;
    }
}
