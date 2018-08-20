package com.lepkovich.observer.model;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
