package factory;

import factory.weaponTypes.*;

public class WeaponFactory {
    public static Weapon buildWeapon(WeaponType weaponType) {
        if (weaponType.equals(WeaponType.SCISSORS))
            return new Scissors();
        if (weaponType.equals(WeaponType.PAPER))
            return new Paper();
        if (weaponType.equals(WeaponType.ROCK))
            return new Rock();
        if (weaponType.equals(WeaponType.LIZARD))
            return new Lizard();
        return new Spock();
    }
}
