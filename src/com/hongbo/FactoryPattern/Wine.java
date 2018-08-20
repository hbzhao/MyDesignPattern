package com.hongbo.FactoryPattern;

public class Wine implements IProduct {

    private String serialNumber;

    public Wine(String serialNumber){
        this.serialNumber=serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void showInformation() {
        System.out.println("this is wine "+serialNumber);
    }
}
