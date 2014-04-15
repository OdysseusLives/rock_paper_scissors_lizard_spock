import factory.Weapon;
import lombok.Data;

@Data
public class Match {
    private static final String STALEMATE = "So did your opponent!\nNo one wins.";
    private Weapon personWeapon;
    private Weapon machineWeapon;

    public Match(Weapon personWeapon, Weapon machineWeapon) {
        this.personWeapon = personWeapon;
        this.machineWeapon = machineWeapon;
    }

    public String results() {
        String message = "You chose " + personWeapon.thisWeaponType() + ".\n";
        if (isAStalemate())
            return message + STALEMATE;
        return message + winningMessage();
    }

    private boolean isAStalemate() {
        return personWeapon.thisWeaponType().equals(machineWeapon.thisWeaponType());
    }

    private String winningMessage() {
        return personWeapon.attack(machineWeapon.thisWeaponType()) + "\n" +
                personWeapon.determineWinner(machineWeapon.thisWeaponType()) + " wins.";
    }
}