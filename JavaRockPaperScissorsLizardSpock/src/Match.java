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
        String message = "You chose " + personWeapon.type() + ".\n";
        if (isAStalemate())
            return message + STALEMATE;
        return message + winningMessage();
    }

    private boolean isAStalemate() {
        return personWeapon.type().equals(machineWeapon.type());
    }

    private String winningMessage() {
        return personWeapon.attack(machineWeapon.type()) + "\n" +
                personWeapon.determineWinner(machineWeapon.type()) + " wins.";
    }

}