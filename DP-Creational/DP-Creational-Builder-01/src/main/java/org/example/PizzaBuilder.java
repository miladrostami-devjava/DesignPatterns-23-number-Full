package org.example;

public class PizzaBuilder {
    private final Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
        pizza.setBread(true);
        pizza.setCheese(true);

    }

    public PizzaBuilder(Pizza pizza) {
        this.pizza = pizza;
    }

    public PizzaBuilder setName(String name){
        pizza.setName(name);
        return this;
    }

    public PizzaBuilder setBread(){
        pizza.setBread(true);
        return this;
    }

    public PizzaBuilder setCheese(){
        pizza.setCheese(true);
        return this;
    }
    public PizzaBuilder setSauce(){
        pizza.setSauce(true);
        return this;
    }

    public PizzaBuilder setSalt(){
        pizza.setSalt(true);
        return this;
    }

    public PizzaBuilder setBlackPepper(){
        pizza.setBlackPepper(true);
        return this;
    }
    public PizzaBuilder setOnionPowder(){
        pizza.setOnionPowder(true);
        return this;
    }

    public PizzaBuilder setGarlicPowder(){
        pizza.setGarlicPowder(true);
        return this;
    }
    public Pizza bakeBuilder(){
        return pizza;
    }

}
