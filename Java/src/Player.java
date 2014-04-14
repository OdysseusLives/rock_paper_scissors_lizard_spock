import lombok.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Data
public class Player {
    Weapon weapon;
    BufferedReader br;

    public void generateWeapon() {
        this.setWeapon(Weapon.getRandomWeapon());
    }

    public void chooseWeapon() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        setWeapon(returnWeaponChoice(readWeaponChoice(br)));
    }

    protected Weapon returnWeaponChoice(String weaponChoice)  {
        try {
            return Weapon.valueOf(weaponChoice.toUpperCase());
        } catch (Exception e) {
            throw new EnumConstantNotPresentException(Weapon.class, "Invalid weapon choice!");
        }
    }

    protected String readWeaponChoice(BufferedReader br) throws IOException {
        try {
            return br.readLine();
        } catch (IOException ioe) {
            throw new IOException("IO error trying to read your weapon!");
        }
    }

}
