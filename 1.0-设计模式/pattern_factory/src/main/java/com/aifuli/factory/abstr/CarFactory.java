package com.aifuli.factory.abstr;

import com.aifuli.factory.Car;
import com.aifuli.factory.TesLa;
import com.aifuli.factory.func.MaseratiFactory;
import com.aifuli.factory.func.MazdaFactory;
import com.aifuli.factory.func.TeslaFactory;

public class CarFactory extends AbstractFactory {
    @Override
    public Car getTeslaCar() {
        return new TeslaFactory().getCar();
    }

    @Override
    public Car getMazdaCar() {
        return new MazdaFactory().getCar();
    }

    @Override
    public Car getMaseratiCar() {
        return new MaseratiFactory().getCar();
    }
}
