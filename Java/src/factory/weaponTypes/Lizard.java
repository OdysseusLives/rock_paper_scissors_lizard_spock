package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class Lizard extends Weapon {
    public WeaponType thisWeaponType() {
        return WeaponType.LIZARD;
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(WeaponType.PAPER, WeaponType.SPOCK);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new HashMap<>();
        destruction.put(WeaponType.SCISSORS, "is decapitated by");
        destruction.put(WeaponType.PAPER, "eats");
        destruction.put(WeaponType.ROCK, "is crushed by");
        destruction.put(WeaponType.SPOCK, "poisons");
        return destruction;
    }
}
