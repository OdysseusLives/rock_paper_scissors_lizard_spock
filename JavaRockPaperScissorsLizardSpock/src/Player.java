import factory.Weapon;
import factory.WeaponFactory;
import factory.WeaponType;
import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;

@Data
public class Player {
    private Weapon weapon;

    public void generateWeapon() {
        this.setWeapon(WeaponFactory.buildWeapon(WeaponType.getRandomWeapon()));
    }

    public void chooseWeapon(BufferedReader bufferedReader) throws IOException {
        setWeaponChoice(readWeaponChoice(bufferedReader), bufferedReader);
    }

    private void setWeaponChoice(String weaponChoice, BufferedReader bufferedReader) throws IOException {
        try {
            WeaponType weaponType = WeaponType.valueOf(weaponChoice.toUpperCase());
            setWeapon(WeaponFactory.buildWeapon(weaponType));
        } catch (Exception e) {
            System.out.println(invalidWeaponMessage(weaponChoice));
            chooseWeapon(bufferedReader);
        }
    }

    private String invalidWeaponMessage(String weaponChoice) {
        return weaponChoice + " is an invalid weapon choice!  Enter a different weapon.";
    }

    private String readWeaponChoice(BufferedReader bufferedReader) throws IOException {
        try {
            return bufferedReader.readLine();
        } catch (IOException ioe) {
            throw new IOException("IO error trying to read your weapon!");
        }
    }

}
