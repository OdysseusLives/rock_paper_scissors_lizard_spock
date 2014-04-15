package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponType;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.Arrays.asList;

public class Rock extends Weapon {
    private WeaponType thisWeaponType = WeaponType.ROCK;

    public WeaponType determineWinner(WeaponType weaponType) {
        return determineWinner(thisWeaponType, weaponType);
    }

    public String attack(WeaponType weaponType) {
        return attack(thisWeaponType, weaponType);
    }

    protected List<WeaponType> weaponsThatIBeat() {
        return asList(WeaponType.SCISSORS, WeaponType.LIZARD);
    }

    protected Map<WeaponType, String> technique() {
        Map<WeaponType, String> destruction = new TreeMap<>();
        destruction.put(WeaponType.SCISSORS, "crushes");
        destruction.put(WeaponType.PAPER, "is covered by");
        destruction.put(WeaponType.LIZARD, "crushes");
        destruction.put(WeaponType.SPOCK, "is vaporized by");
        return destruction;
    }
}
