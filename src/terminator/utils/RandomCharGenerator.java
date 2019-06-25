package terminator.utils;

public class RandomCharGenerator {
    public static int rnd(int max, int min) {
        int random = (int) (Math.random() * (max - min + 1) + min);
        return random;
    }

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'C');
    }
}

