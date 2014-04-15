package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static factory.WeaponType.*;
import static java.util.Arrays.asList;

public class Spock extends Weapon {

    public WeaponType thisWeaponType() {
        return SPOCK;
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(SCISSORS, ROCK);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new HashMap<>();
        destruction.put(SCISSORS, "smashes");
        destruction.put(PAPER, "is disproved by");
        destruction.put(ROCK, "vaporizes");
        destruction.put(LIZARD, "is poisoned by");
        return destruction;
    }
}