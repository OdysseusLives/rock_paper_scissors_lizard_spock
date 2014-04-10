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

    public void chooseWeapon() {
        br = new BufferedReader(new InputStreamReader(System.in));
        setWeapon(returnWeaponChoice(br));
    }

    protected Weapon returnWeaponChoice(BufferedReader br) {
        String weaponChoice = readWeaponChoice(br);

        Weapon weapon = Weapon.ROCK;
        try {
            weapon = Weapon.valueOf(weaponChoice.toUpperCase());
        } catch (Exception e) {
            System.out.println("Invalid weapon choice!");
            System.exit(1);
        }
        return weapon;
    }

    protected String readWeaponChoice(BufferedReader br) {
        String weaponChoice = "";
        try {
            weaponChoice = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your weapon!");
            System.exit(1);
        }
        return weaponChoice;
    }

}
