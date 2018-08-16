package com.hongbo.SingletonPattern;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){

    }

    public Singleton getSingleton(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
