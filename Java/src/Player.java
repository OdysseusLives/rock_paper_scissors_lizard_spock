import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;

@Data
public class Player {
    Weapon weapon;
    BufferedReader br;

    public void generateWeapon() {
        this.setWeapon(Weapon.getRandomWeapon());
    }

    public void chooseWeapon(BufferedReader bufferedReader) throws IOException {
        setWeapon(returnWeaponChoice(readWeaponChoice(br)));
    }

    private Weapon returnWeaponChoice(String weaponChoice)  {
        try {
            return Weapon.valueOf(weaponChoice.toUpperCase());
        } catch (Exception e) {
            throw new EnumConstantNotPresentException(Weapon.class, "Invalid weapon choice!");
        }
    }

    private String readWeaponChoice(BufferedReader br) throws IOException {
        try {
            return br.readLine();
        } catch (IOException ioe) {
            throw new IOException("IO error trying to read your weapon!");
        }
    }

}
