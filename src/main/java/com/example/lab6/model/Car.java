package com.example.lab6.model;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void run(){
        engine.run();
    }
}
