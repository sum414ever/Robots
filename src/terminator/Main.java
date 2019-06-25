package terminator;

import terminator.entities.BetterRobot;
import terminator.entities.Robot;
import terminator.entities.TheBestRobot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("First");
        robot.move();
        robot.scream();
        robot.shoot();


        BetterRobot betterRobot = new BetterRobot("Second");
        betterRobot.move();
        betterRobot.scream();
        betterRobot.move();
        betterRobot.myNewForm();

        TheBestRobot theBestRobot = new TheBestRobot("Third");
        theBestRobot.move();
        theBestRobot.scream();
        theBestRobot.shoot();
        theBestRobot.myResistant();

    }
}
