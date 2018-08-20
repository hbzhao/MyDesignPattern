package com.hongbo.FactoryPattern;

public class Test {
    public static void main(String[] args){
        WineFactory factory=new WineFactory();
        IProduct p1=factory.createProduct();
        IProduct p2=factory.createProduct();
        IProduct p3=factory.createProduct();

        p1.showInformation();
        p2.showInformation();
        p3.showInformation();
    }
}
