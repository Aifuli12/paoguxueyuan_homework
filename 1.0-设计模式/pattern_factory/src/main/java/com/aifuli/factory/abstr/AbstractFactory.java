package com.aifuli.factory.abstr;

import com.aifuli.factory.Car;

public abstract class AbstractFactory {
    public abstract Car getTeslaCar();
    public abstract Car getMazdaCar();
    public abstract Car getMaseratiCar();
}
