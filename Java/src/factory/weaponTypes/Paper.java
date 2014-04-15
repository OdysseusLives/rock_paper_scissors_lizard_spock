package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.Arrays.asList;

public class Paper extends Weapon {
    public WeaponType thisWeaponType() {
        return WeaponType.PAPER;
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(WeaponType.ROCK, WeaponType.SPOCK);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new TreeMap<>();
        destruction.put(WeaponType.SCISSORS, "is cut by");
        destruction.put(WeaponType.ROCK, "covers");
        destruction.put(WeaponType.LIZARD, "is eaten by");
        destruction.put(WeaponType.SPOCK, "disproves");
        return destruction;
    }
}
