package factory;

import java.util.Arrays;

public enum WeaponType {
    SCISSORS, PAPER, ROCK, LIZARD, SPOCK;

    public static String choices() {
        return "Enter your weapon selection:" + "\n" +
                "Choices: " + Arrays.toString(WeaponType.values());
    }

    public static WeaponType getRandomWeapon() {
        return values()[(int) (Math.random() * values().length)];
    }
}
