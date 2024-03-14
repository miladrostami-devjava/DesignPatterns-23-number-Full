package org.example.fan;

public class Fan {
    private int speed = 0;
    public void start(){
        System.out.println("fan started !");
        speed = 1;
    }
    public void stop(){
        System.out.println("fan stopped !");
        speed = 0;
    }
    public void increaseSpeed(){
        if (speed < 3){
            speed ++;
            System.out.println("Fan speed increase to " + " " + speed);
        }else {
            System.out.println("Fan already at maximum speed!");
        }
    }
    public void decreaseSpeed(){
        if (speed > 1){
            speed --;
            System.out.println("Fan speed decrease to " + " " + speed);
        }else {
            System.out.println("Fan already at minimum speed!");
        }
    }

}
