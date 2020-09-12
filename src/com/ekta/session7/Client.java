package com.ekta.session7;

public class Client {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4);
        Vehicle v2 = new Vehicle();
        v2.setWheels(3);
//        System.out.println(v2.getWheels());

        Animal a = new Dog();
        a.sound();
//        Dog d = new Animal();
//        d.sound();
    }
}
