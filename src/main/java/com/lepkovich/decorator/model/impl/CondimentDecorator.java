package com.lepkovich.decorator.model.impl;

import com.lepkovich.decorator.model.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
