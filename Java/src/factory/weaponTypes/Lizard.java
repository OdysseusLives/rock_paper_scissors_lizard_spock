package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static factory.WeaponType.*;
import static java.util.Arrays.asList;

public class Lizard extends Weapon {
    public WeaponType thisWeaponType() {
        return LIZARD;
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(PAPER, SPOCK);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new HashMap<>();
        destruction.put(SCISSORS, "is decapitated by");
        destruction.put(PAPER, "eats");
        destruction.put(ROCK, "is crushed by");
        destruction.put(SPOCK, "poisons");
        return destruction;
    }
}
