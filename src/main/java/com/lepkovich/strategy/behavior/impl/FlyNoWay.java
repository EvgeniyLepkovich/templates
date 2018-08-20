package com.lepkovich.strategy.behavior.impl;

import com.lepkovich.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
