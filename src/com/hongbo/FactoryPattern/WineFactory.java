package com.hongbo.FactoryPattern;

public class WineFactory extends Factory {



    @Override
    protected void inspect(IProduct product) {
        Wine wine=(Wine)product;
        System.out.println("Ispecting "+wine.getSerialNumber()+"... pass");
    }

    @Override
    protected IProduct create(String serialNumber) {
        Wine wine=new Wine(serialNumber);
        return wine;
    }
}
