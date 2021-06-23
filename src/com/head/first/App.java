package com.head.first;

import com.head.first.behavior.fly.FlyWithWings;
import com.head.first.client.Duck;
import com.head.first.client.MallardDuck;

public class App {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFlyBehavior();
    }
}
