package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class Rock extends Weapon {

    public WeaponType thisWeaponType() {
        return WeaponType.ROCK;
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(WeaponType.SCISSORS, WeaponType.LIZARD);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new HashMap<>();
        destruction.put(WeaponType.SCISSORS, "crushes");
        destruction.put(WeaponType.PAPER, "is covered by");
        destruction.put(WeaponType.LIZARD, "crushes");
        destruction.put(WeaponType.SPOCK, "is vaporized by");
        return destruction;
    }
}