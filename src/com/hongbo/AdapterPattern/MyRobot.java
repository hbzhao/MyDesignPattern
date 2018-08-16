package com.hongbo.AdapterPattern;

public class MyRobot {
    private String name;
    public MyRobot(String name){
        this.name=name;
    }

    public void sayHello(){
        System.out.println("hello i'm robot "+name);
    }

    public void dance(){
        System.out.println("Dancing for you");
    }
}
