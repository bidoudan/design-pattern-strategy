package com.head.first.client;

import com.head.first.behavior.fly.FlyBehavior;
import com.head.first.behavior.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFlyBehavior() {
        flyBehavior.fly();
    }

    public void performQuackBehavior() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void swim() {
        System.out.println("I am swimming");
    }
}
