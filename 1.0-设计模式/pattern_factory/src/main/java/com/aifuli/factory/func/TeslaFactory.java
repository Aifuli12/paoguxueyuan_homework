package com.aifuli.factory.func;

import com.aifuli.factory.Car;
import com.aifuli.factory.TesLa;

public class TeslaFactory implements Factory {
    @Override
    public Car getCar() {
        return new TesLa();
    }
}
