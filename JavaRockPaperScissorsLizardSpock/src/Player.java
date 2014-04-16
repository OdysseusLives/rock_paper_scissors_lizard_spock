import factory.Weapon;
import factory.WeaponFactory;
import factory.WeaponType;
import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;

@Data
public class Player {
    Weapon weapon;

    public void generateWeapon() {
        this.setWeapon(WeaponFactory.buildWeapon(WeaponType.getRandomWeapon()));
    }

    public void chooseWeapon(BufferedReader bufferedReader) throws IOException {
        setWeapon(returnWeaponChoice(readWeaponChoice(bufferedReader)));
    }

    private Weapon returnWeaponChoice(String weaponChoice)  {
        try {
            WeaponType weaponType = WeaponType.valueOf(weaponChoice.toUpperCase());
            return WeaponFactory.buildWeapon(weaponType);
        } catch (Exception e) {
            throw new EnumConstantNotPresentException(WeaponType.class, weaponChoice + " is an invalid weapon choice!");
        }
    }

    private String readWeaponChoice(BufferedReader bufferedReader) throws IOException {
        try {
            return bufferedReader.readLine();
        } catch (IOException ioe) {
            throw new IOException("IO error trying to read your weapon!");
        }
    }

}
