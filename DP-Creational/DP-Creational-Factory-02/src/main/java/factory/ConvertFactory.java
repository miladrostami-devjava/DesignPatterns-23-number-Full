package factory;

import models.Converter;
import models.JsonConverter;
import models.XMLConverter;

public class ConvertFactory {
    public Converter converter(String type){
        if (type.equalsIgnoreCase("json")){
            return new JsonConverter();
        } else if (type.equalsIgnoreCase("xml")) {
            return new XMLConverter();
        }else {
            throw new IllegalArgumentException("invalid src file");
        }


    }

}
