package factory;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public abstract class Weapon {

    public abstract WeaponType determineWinner(WeaponType weaponType);

    public WeaponType determineWinner(WeaponType personWeapon, WeaponType machineWeapon){
        if (weaponsThatIBeat().contains(machineWeapon))
            return personWeapon;
        return machineWeapon;
    }

    public abstract String attack(WeaponType weaponType);

    public String attack(WeaponType thisWeaponType, WeaponType weaponType) {
        return String.format("%s %s %s.", thisWeaponType, technique().get(weaponType), weaponType);
    }

    protected abstract List<WeaponType> weaponsThatIBeat();

    protected abstract Map<WeaponType, String> technique();
}
