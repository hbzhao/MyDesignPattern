package com.hongbo.DecoratorPattern;

public class Test {
    public static void main(String[] args){
        Display display=new StarBorder(new Paint());
        display.doDisplay();
    }
}
