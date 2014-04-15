package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class Spock extends Weapon {

    public WeaponType thisWeaponType() {
        return WeaponType.SPOCK;
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(WeaponType.SCISSORS, WeaponType.ROCK);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new HashMap<>();
        destruction.put(WeaponType.SCISSORS, "smashes");
        destruction.put(WeaponType.PAPER, "is disproved by");
        destruction.put(WeaponType.ROCK, "vaporizes");
        destruction.put(WeaponType.LIZARD, "is poisoned by");
        return destruction;
    }
}