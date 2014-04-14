import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;

@Data
public class Player {
    private Weapon weapon;

    public void generateWeapon() {
        this.setWeapon(Weapon.getRandomWeapon());
    }

    public void chooseWeapon(BufferedReader bufferedReader) throws IOException {
        setWeapon(returnWeaponChoice(readWeaponChoice(bufferedReader)));
    }

    private Weapon returnWeaponChoice(String weaponChoice)  {
        try {
            return Weapon.valueOf(weaponChoice.toUpperCase());
        } catch (Exception e) {
            throw new EnumConstantNotPresentException(Weapon.class, "Invalid weapon choice!");
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
