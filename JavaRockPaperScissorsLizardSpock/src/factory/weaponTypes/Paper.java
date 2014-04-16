package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static factory.WeaponType.*;
import static java.util.Arrays.asList;

public class Paper extends Weapon {
    public WeaponType type() {
        return PAPER;
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(ROCK, SPOCK);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new TreeMap<>();
        destruction.put(SCISSORS, "is cut by");
        destruction.put(ROCK, "covers");
        destruction.put(LIZARD, "is eaten by");
        destruction.put(SPOCK, "disproves");
        return destruction;
    }
}
