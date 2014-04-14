import lombok.Data;

@Data
public class Match {
    Weapon personWeapon;
    Weapon machineWeapon;

    public Match(Weapon personWeapon, Weapon machineWeapon) {
        this.personWeapon = personWeapon;
        this.machineWeapon = machineWeapon;
    }

    protected boolean isAStalemate() {
        return personWeapon.equals(machineWeapon);
    }

    public String results() {
        String message = "You chose " + personWeapon + ".\n";
        if (isAStalemate())
            return message + stalemateMessage();
        return message + winningMessage();
    }

    private String stalemateMessage() {
        return "So did your opponent!\nNo one wins.";
    }

    private String winningMessage() {
        return personWeapon.attack(machineWeapon) + "\n" +
                personWeapon.determineWinner(machineWeapon) + " wins.";
    }
}