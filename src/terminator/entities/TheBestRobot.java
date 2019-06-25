package terminator.entities;

import static terminator.utils.RandomCharGenerator.getRandomUpperCaseLetter;

public class TheBestRobot extends Robot {
    private String changeResistant;
    private String typeOfDamage;

    public TheBestRobot(String robotName) {
        super(robotName);
    }

    public void myResistant() {
        if (getRandomUpperCaseLetter() == 'A') {
            typeOfDamage = "water";
            changeResistant = typeOfDamage + " resistant";
        } else if (getRandomUpperCaseLetter() == 'B') {
            typeOfDamage = "fire";
            changeResistant = typeOfDamage + " resistant";
        } else
            typeOfDamage = "wind";
        changeResistant = typeOfDamage + " resistant";
        System.out.println("If I fly to planet of " + typeOfDamage + " I must have " + changeResistant);
    }

    @Override
    public void move() {
        System.out.println("I`m " + getRobotName() + " and i`m the fastest");
    }

    @Override
    public void scream() {
        System.out.println("I`m  " + getRobotName() + " and i`m the loudest");
    }

    @Override
    public void shoot() {
        System.out.println("I`m  " + getRobotName() + "  the best killer and I kill all people");
    }
}
