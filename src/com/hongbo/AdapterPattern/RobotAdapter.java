package com.hongbo.AdapterPattern;

public class RobotAdapter implements IRobot{
    private MyRobot robot;

    public RobotAdapter(String name) {
        this.robot = new MyRobot(name);
    }

    @Override
    public void greeting() {
        robot.sayHello();
    }

    @Override
    public void dancing() {
        robot.dance();
    }
}
