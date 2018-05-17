package com.aifuli.factory.func;

import com.aifuli.factory.Car;
import com.aifuli.factory.Mazda;

public class MazdaFactory implements Factory {
    @Override
    public Car getCar() {
        return new Mazda();
    }
}
