package com.hongbo.ObserverPattern;


//观察者实现的接口
public interface IObserver {
    void update(String event,String eventArgs);
}
