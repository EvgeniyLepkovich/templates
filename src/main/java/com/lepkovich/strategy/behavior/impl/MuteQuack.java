package com.lepkovich.strategy.behavior.impl;

import com.lepkovich.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
