package com.aifuli.factory;

import com.aifuli.factory.abstr.CarFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CarFactory carFactory=new CarFactory();

        System.out.println( carFactory.getMaseratiCar().getName());
    }
}
