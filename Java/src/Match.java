import lombok.Data;

@Data
public class Match {
    Weapon personWeapon;
    Weapon machineWeapon;

    public Match(Weapon personWeapon, Weapon machineWeapon) {
        this.personWeapon = personWeapon;
        this.machineWeapon = machineWeapon;
    }

    protected String determineWinner() {
        if (personWeapon.equals(machineWeapon))
            return "stalemate";
        return personWeapon.determineWinner(machineWeapon).toString();
    }

    public String results() {
        String message = "You chose " + personWeapon + ".\n";
        String winner = determineWinner();
        if (winner.equals("stalemate"))
            return message + stalemateMessage();
        return message + winningMessage(winner);
    }

    private String stalemateMessage() {
        return "So did your opponent!\nNo one wins.";
    }

    private String winningMessage(String winner) {
        return "The winner of " + personWeapon + " vs " + machineWeapon + " is " + winner;
    }
}