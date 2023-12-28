package com.shopNothing;

public class Goods {

    private String greeting;
    private String target;

    // Constructor
    public Goods(String greeting, String target) {
        this.greeting = greeting;
        this.target = target;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
