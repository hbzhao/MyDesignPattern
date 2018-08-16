package com.hongbo.IteratorPattern;

public class Test {
    public static void main(String[] args){
        CarShop carShop=new CarShop();
        carShop.addCar(new Car("audi"));
        carShop.addCar(new Car("changcheng"));
        Iterator i=carShop.getIterator();
        while (i.hasNext()){
            System.out.println(((Car)i.getNext()).getName());
        }
    }
}
