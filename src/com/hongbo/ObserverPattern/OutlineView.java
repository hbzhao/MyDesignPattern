package com.hongbo.ObserverPattern;

public class OutlineView implements IObserver {
    @Override
    public void update(String event, String eventArgs) {
        if(event.equals("load")){
            System.out.println("OutlineView try to load "+eventArgs);
        }
    }
}
