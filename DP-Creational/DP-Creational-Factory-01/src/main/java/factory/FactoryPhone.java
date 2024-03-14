package factory;

import models.Phone;
import models.iphone.IPhone;
import models.samsung.Samsung;

public class FactoryPhone {

    public Phone createPhone(String type) {
        if (type.equalsIgnoreCase("iphone")) {
            return new IPhone();
        } else if (type.equalsIgnoreCase("samsung")) {
            return new Samsung();
        } else {
            throw new IllegalArgumentException("Invalid phone type");
        }
    }
}
