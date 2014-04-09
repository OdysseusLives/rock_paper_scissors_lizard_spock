import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        run(br);
    }

    public static void run(BufferedReader br) {
        displayWeaponChoices();
        Weapon weapon = returnWeaponChoice(br);
        displayResults(weapon);
    }

    private static void displayResults(Weapon weapon) {
        System.out.println("You chose " + weapon);
        System.out.println("The winner of Rock vs " + weapon + " is " + new Match(Weapon.ROCK, weapon).winningMove());
    }

    private static void displayWeaponChoices() {
        System.out.println("Enter your weapon selection:");
        System.out.println("Choices: " + Arrays.toString(Weapon.values()));
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
