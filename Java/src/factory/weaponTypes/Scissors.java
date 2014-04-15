package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class Scissors extends Weapon {

    public WeaponType thisWeaponType() {
        return WeaponType.SCISSORS;
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(WeaponType.PAPER, WeaponType.LIZARD);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new HashMap<>();
        destruction.put(WeaponType.PAPER, "cut");
        destruction.put(WeaponType.ROCK, "is crushed by");
        destruction.put(WeaponType.LIZARD, "decapitate");
        destruction.put(WeaponType.SPOCK, "is smashed by");
        return destruction;
    }
}