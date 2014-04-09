import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Match {
    public String run(BufferedReader br) {
        String results = "";

        results += displayWeaponChoices();
        Weapon weapon = returnWeaponChoice(br);
        results += displayResults(weapon);
        return results;
    }

    private String displayResults(Weapon weapon) {
        return "You chose " + weapon +
               "The winner of " + Weapon.ROCK + " vs " + weapon + " is " + Weapon.ROCK.determineWinner(weapon);
    }

    private String displayWeaponChoices() {
        return "Enter your weapon selection:" +
               "Choices: " + Arrays.toString(Weapon.values());
    }

    private static Weapon returnWeaponChoice(BufferedReader br) {
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

    private static String readWeaponChoice(BufferedReader br) {
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