package com.lepkovich.strategy.behavior.impl;

import com.lepkovich.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
