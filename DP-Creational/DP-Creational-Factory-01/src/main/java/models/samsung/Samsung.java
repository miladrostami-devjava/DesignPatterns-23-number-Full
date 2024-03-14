package models.samsung;


import models.Phone;

public class Samsung implements Phone {
    @Override
    public void manufacture(){
        System.out.println("Manufacturing samsung mobile!");
    }

}
