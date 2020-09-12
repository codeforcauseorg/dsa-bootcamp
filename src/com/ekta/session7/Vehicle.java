package com.ekta.session7;

public class Vehicle {
    private int wheels;

    public void start() {
        System.out.println("Start like general vehicle");
        System.out.println(this.wheels);
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return this.wheels;
    }

    Vehicle() {
        this.wheels = 2;
    }

    Vehicle(int wheels) {
        this.wheels = wheels;
    }
}
