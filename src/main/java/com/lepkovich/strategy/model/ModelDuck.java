package com.lepkovich.strategy.model;

import com.lepkovich.strategy.behavior.impl.FlyNoWay;
import com.lepkovich.strategy.behavior.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
