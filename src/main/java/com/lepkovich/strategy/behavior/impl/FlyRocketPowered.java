package com.lepkovich.strategy.behavior.impl;

import com.lepkovich.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
