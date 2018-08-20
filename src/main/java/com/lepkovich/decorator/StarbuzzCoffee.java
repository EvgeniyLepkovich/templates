package com.lepkovich.decorator;

import com.lepkovich.decorator.model.Beverage;
import com.lepkovich.decorator.model.impl.Espresso;
import com.lepkovich.decorator.model.impl.Mocha;
import com.lepkovich.decorator.model.impl.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
