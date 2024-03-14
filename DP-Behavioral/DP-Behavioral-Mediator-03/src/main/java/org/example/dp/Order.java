package org.example.dp;

public class Order {
    private final NotificationMediator mediator;


    public Order(NotificationMediator mediator) {
        this.mediator = mediator;
    }

    public void placeOrder(){
        mediator.sendNotification("+98917524587","send  text via ...");
        mediator.sendNotification("aks@gmail.com","send  text via ...");
        mediator.sendNotification("+gy7t8yjk4545j","send  text via ...");
    }




}
