package com.example.lab6;

import com.example.lab6.model.Car;
import com.example.lab6.model.Engine;
import com.example.lab6.model.EngineCar;

public class ExampleEcoSys {
    public static void main(String[] args) {
        Engine en = new EngineCar();

        Car car = new Car(en);
        car.run();

    }
}
