import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Game {
    public void run(BufferedReader br) {
        System.out.println(displayWeaponChoices());
        Weapon weapon = returnWeaponChoice(br);
        System.out.println(displayResults(weapon));
    }

    protected String displayResults(Weapon weapon) {
        String message = "You chose " + weapon + "\n";
        String matchResult = new Match().determineWinner(Weapon.ROCK, weapon);
        if (matchResult.equals("stalemate"))
            return message + stalemateResponse();
        return message + winningResponse(weapon, matchResult);
    }

    private String winningResponse(Weapon weapon, String matchResult) {
        return "The winner of " + Weapon.ROCK +
               " vs " + weapon +
               " is " + matchResult;
    }

    private String stalemateResponse() {
        return "So did your opponent!\nNo one wins.";
    }

    protected String displayWeaponChoices() {
        return "Enter your weapon selection:" + "\n" +
                "Choices: " + Arrays.toString(Weapon.values());
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