package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static factory.WeaponType.*;
import static java.util.Arrays.asList;

public class Rock extends Weapon {

    public WeaponType thisWeaponType() {
        return ROCK;
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(SCISSORS, LIZARD);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new HashMap<>();
        destruction.put(SCISSORS, "crushes");
        destruction.put(PAPER, "is covered by");
        destruction.put(LIZARD, "crushes");
        destruction.put(SPOCK, "is vaporized by");
        return destruction;
    }
}