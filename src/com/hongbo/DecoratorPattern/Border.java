package com.hongbo.DecoratorPattern;


//这个是装饰类的抽象类，包含有一个被装饰类的抽象类对象，用来装载新的装饰类
//需要继承自Display，方便装饰类的嵌套
public abstract class Border extends Display{
    protected Display display;
    public Border(Display display){
        this.display=display;
    }
}
