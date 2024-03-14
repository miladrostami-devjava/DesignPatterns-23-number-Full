package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Pizza pepperoniPizza = new PizzaBuilder()
                .setName("pepperoni")
                .setBread()
                .setSalt()
                .setCheese()
                .setSauce()
                .bakeBuilder();

        System.out.println("pizza is:" + pepperoniPizza.toString());
    }
}
