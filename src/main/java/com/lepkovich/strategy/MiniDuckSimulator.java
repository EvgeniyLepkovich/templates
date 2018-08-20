package com.lepkovich.strategy;

import com.lepkovich.strategy.behavior.impl.FlyRocketPowered;
import com.lepkovich.strategy.model.Duck;
import com.lepkovich.strategy.model.MallardDuck;
import com.lepkovich.strategy.model.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
