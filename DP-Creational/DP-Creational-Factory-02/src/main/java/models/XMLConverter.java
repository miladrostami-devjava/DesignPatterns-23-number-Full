package models;

public class XMLConverter implements Converter{
   @Override
    public String convert(String json){
        return "XML" + json;
    }
}
