package com.lepkovich.strategy.model;

import com.lepkovich.strategy.behavior.impl.FlyWithWings;
import com.lepkovich.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
