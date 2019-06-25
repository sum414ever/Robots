package terminator.entities;

import terminator.Actions;

public class Robot implements Actions {
    private String robotName;

    public Robot(String robotName) {
        this.robotName = robotName;
    }

    public String getRobotName() {
        return robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    @Override
    public void move() {
        System.out.println("I`m " + getRobotName() + " and I move for you");
    }

    @Override
    public void scream() {
        System.out.println("I`m " + getRobotName() + " and I  kill you");

    }

    @Override
    public void shoot() {
        System.out.println("I`m " + getRobotName() + " and I  start shooting");

    }

}

