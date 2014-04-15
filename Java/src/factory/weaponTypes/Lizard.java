package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.Arrays.asList;

public class Lizard extends Weapon {
    private WeaponType thisWeaponType = WeaponType.LIZARD;

    public WeaponType determineWinner(WeaponType weaponType) {
        return determineWinner(thisWeaponType, weaponType);
    }

    public String attack(WeaponType weaponType) {
        return attack(thisWeaponType, weaponType);
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(WeaponType.PAPER, WeaponType.SPOCK);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new TreeMap<>();
        destruction.put(WeaponType.SCISSORS, "is decapitated by");
        destruction.put(WeaponType.PAPER, "eats");
        destruction.put(WeaponType.ROCK, "is crushed by");
        destruction.put(WeaponType.SPOCK, "poisons");
        return destruction;
    }
}
