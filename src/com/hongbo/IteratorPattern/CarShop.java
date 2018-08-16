package com.hongbo.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class CarShop implements Iterale {
    private List<Car> carList=new ArrayList<>();

    public void addCar(Car car){
        carList.add(car);
    }



//  内部成员类拥有外部类的一个引用，使得它可以访问外部类的变量
//  如果还是静态的内部成员类，则不能实现
    @Override
    public Iterator getIterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator{
        private int pos=0;
        @Override
        public void reset() {
            pos=0;
        }

        @Override
        public boolean hasNext() {
            return pos<carList.size();
        }

        @Override
        public Object getNext() {
            int t=pos;
            pos++;
            return carList.get(t);
        }
    }

}
