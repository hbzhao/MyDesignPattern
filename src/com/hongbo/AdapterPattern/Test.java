package com.hongbo.AdapterPattern;

public class Test {
    public static void main(String[] args){
        IRobot robot=new RobotAdapter("charlie");
        robot.greeting();
        robot.dancing();
    }
}
