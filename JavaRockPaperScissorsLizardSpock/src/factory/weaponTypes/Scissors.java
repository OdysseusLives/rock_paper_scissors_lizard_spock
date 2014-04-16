package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static factory.WeaponType.*;
import static java.util.Arrays.asList;

public class Scissors extends Weapon {

    public WeaponType type() {
        return SCISSORS;
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(PAPER, LIZARD);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new HashMap<>();
        destruction.put(PAPER, "cut");
        destruction.put(ROCK, "is crushed by");
        destruction.put(LIZARD, "decapitate");
        destruction.put(SPOCK, "is smashed by");
        return destruction;
    }
}