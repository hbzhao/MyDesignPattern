package com.hongbo.SingletonPattern;

public class ConcurrentSingleton {
//    volatile关键字用来防止命令的重排列
    private static volatile ConcurrentSingleton singleton;
    private ConcurrentSingleton(){

    }
    public ConcurrentSingleton getSingleton(){
//        双重检索
        if(singleton==null){
//            只有当singleton为空时进入，缩小同步块 提高性能
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton=new ConcurrentSingleton();
                }
            }
        }
        return singleton;
    }
}
