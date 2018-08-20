package com.hongbo.ObserverPattern;

public class EditView implements IObserver {
    @Override
    public void update(String event, String eventArgs) {
        if(event.equals("load")) {
            System.out.println("EditView try to load" + eventArgs);
        }
    }
}
