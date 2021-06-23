package com.head.first.behavior.fly;

import com.head.first.behavior.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
