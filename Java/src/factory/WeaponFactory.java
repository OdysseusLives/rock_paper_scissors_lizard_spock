package factory;

import factory.weaponTypes.*;

import static factory.WeaponType.*;

public class WeaponFactory {
    public static Weapon buildWeapon(WeaponType weaponType) {
        if (weaponType.equals(SCISSORS))
            return new Scissors();
        if (weaponType.equals(PAPER))
            return new Paper();
        if (weaponType.equals(ROCK))
            return new Rock();
        if (weaponType.equals(LIZARD))
            return new Lizard();
        return new Spock();
    }
}
