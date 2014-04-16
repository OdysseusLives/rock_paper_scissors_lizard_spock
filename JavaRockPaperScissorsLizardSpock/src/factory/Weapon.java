package factory;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public abstract class Weapon {

    public abstract WeaponType type();

    public WeaponType determineWinner(WeaponType weaponType) {
        if (weaponsThatIBeat().contains(weaponType))
            return type();
        return weaponType;
    }

    public String attack(WeaponType weaponType) {
        return String.format("%s %s %s.", type(), technique().get(weaponType), weaponType);
    }

    protected abstract List<WeaponType> weaponsThatIBeat();

    protected abstract Map<WeaponType, String> technique();
}