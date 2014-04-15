package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.Arrays.asList;

public class Spock extends Weapon {
    private WeaponType thisWeaponType = WeaponType.SPOCK;

    public WeaponType determineWinner(WeaponType weaponType) {
        return determineWinner(thisWeaponType, weaponType);
    }


    public String attack(WeaponType weaponType) {
        return attack(thisWeaponType, weaponType);
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(WeaponType.SCISSORS, WeaponType.ROCK);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new TreeMap<>();
        destruction.put(WeaponType.SCISSORS, "smashes");
        destruction.put(WeaponType.PAPER, "is disproved by");
        destruction.put(WeaponType.ROCK, "vaporizes");
        destruction.put(WeaponType.LIZARD, "is poisoned by");
        return destruction;
    }
}
