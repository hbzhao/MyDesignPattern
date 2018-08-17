package com.hongbo.DecoratorPattern;


//这个抽象类决定了被装饰类的主要行为（所有行为）
public abstract class Display {
    public abstract int getColumnCount();
    public abstract int getRowCount();
    public abstract String getRowContent(int index);
    public final void doDisplay(){
        for(int i=0;i<getRowCount();i++){
            System.out.println(getRowContent(i));
        }
    }
}
