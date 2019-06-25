package terminator.entities;

import terminator.utils.UsedConstants;

import static terminator.utils.RandomCharGenerator.rnd;

public class BetterRobot extends Robot {
    private String changeForm;
    private int rnd = rnd(UsedConstants.MIN_VALUE, UsedConstants.MAX_VALUE);

    public BetterRobot(String robotName) {
        super(robotName);
    }


    public void myNewForm() {
        if (rnd < UsedConstants.FIRST_RANGE) {
            changeForm = "Terminator T-800";
        } else if (rnd < UsedConstants.SECOND_RANGE) {
            changeForm = "R2-D2";
        } else
            changeForm = "C-3PO";
        System.out.println("Now my name isn`t " + getRobotName() + ",my name is " + changeForm);
    }

    @Override
    public void move() {
        System.out.println("I move better than Robot");
    }

    @Override
    public void scream() {
        System.out.println("I scream louder than Robot");
    }

    @Override
    public void shoot() {
        System.out.println("I shoot straighter than Robot ");
    }

}
