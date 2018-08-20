package com.hongbo.ObserverPattern;


//监听器实现的接口
public interface IObservable {
    void addObverver(IObserver observer);
    void removeObserver(IObserver observer);
    void doNotify();
}
