import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Weapon weapon = getPlayerWeapon();
        displayResults(weapon);
    }

    private static void displayResults(Weapon weapon) {
        System.out.println("You chose " + weapon);
        System.out.println("The winner of Rock vs " + weapon + " is " + new Match(Weapon.ROCK, weapon).winningMove());
    }

    private static Weapon getPlayerWeapon() {
        System.out.println("Enter your weapon selection:");
        System.out.println("Choices: " + Arrays.toString(Weapon.values()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        return getWeapon(br);
    }

    private static Weapon getWeapon(BufferedReader br) {
        String yourWeapon = readWeapon(br);
        Weapon weapon = Weapon.ROCK;
        try {
            weapon = Weapon.valueOf(yourWeapon.toUpperCase());
        } catch (Exception e) {
            System.out.println("Invalid weapon choice!");
            System.exit(1);
        }
        return weapon;
    }

    private static String readWeapon(BufferedReader br) {
        String yourWeapon = "";
        try {
            yourWeapon = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your weapon!");
            System.exit(1);
        }
        return yourWeapon;
    }
}
