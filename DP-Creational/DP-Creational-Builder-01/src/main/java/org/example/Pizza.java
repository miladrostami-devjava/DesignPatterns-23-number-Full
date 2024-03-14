package org.example;

public class Pizza {
    private String name;
    private boolean bread;
    private boolean cheese;
    private boolean sauce;
    private boolean salt;
    private boolean blackPepper;
    private boolean onionPowder;
    private boolean garlicPowder;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBread() {
        return bread;
    }

    public void setBread(boolean bread) {
        this.bread = bread;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isSauce() {
        return sauce;
    }

    public void setSauce(boolean sauce) {
        this.sauce = sauce;
    }

    public boolean isSalt() {
        return salt;
    }

    public void setSalt(boolean salt) {
        this.salt = salt;
    }

    public boolean isBlackPepper() {
        return blackPepper;
    }

    public void setBlackPepper(boolean blackPepper) {
        this.blackPepper = blackPepper;
    }

    public boolean isOnionPowder() {
        return onionPowder;
    }

    public void setOnionPowder(boolean onionPowder) {
        this.onionPowder = onionPowder;
    }

    public boolean isGarlicPowder() {
        return garlicPowder;
    }

    public void setGarlicPowder(boolean garlicPowder) {
        this.garlicPowder = garlicPowder;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", bread=" + bread +
                ", cheese=" + cheese +
                ", sauce=" + sauce +
                ", salt=" + salt +
                ", blackPepper=" + blackPepper +
                ", onionPowder=" + onionPowder +
                ", garlicPowder=" + garlicPowder +
                '}';
    }
}
