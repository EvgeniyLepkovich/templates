package com.lepkovich.strategy.behavior.impl;

import com.lepkovich.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
