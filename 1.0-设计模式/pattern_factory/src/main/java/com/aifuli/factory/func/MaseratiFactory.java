package com.aifuli.factory.func;

import com.aifuli.factory.Maserati;
import com.aifuli.factory.Car;

public class MaseratiFactory implements Factory {
    @Override
    public Car getCar() {
        return new Maserati();
    }
}
