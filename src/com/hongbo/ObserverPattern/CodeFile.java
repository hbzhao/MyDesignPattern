package com.hongbo.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class CodeFile implements IObservable {

    private String filename;
    private List<IObserver> observerList=new ArrayList<>();

    @Override
    public void addObverver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void doNotify() {
        String code=readCode();
        for(IObserver observer:observerList){
            observer.update("load",code);
        }
    }

    public void load(String filename){
        this.filename=filename;
        doNotify();
    }


    private String readCode(){
        return "code from "+filename;
    }
}
