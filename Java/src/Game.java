import java.util.Arrays;

public class Game {
    Player person = new Player();
    Player machine = new Player();

    public void play() throws Exception {
        System.out.println(displayWeaponChoices());
        person.chooseWeapon();
        machine.generateWeapon();
        Match match = new Match(person.getWeapon(), machine.getWeapon());
        System.out.println(displayResults(match));
    }

    protected String displayWeaponChoices() {
        return "Enter your weapon selection:" + "\n" +
                "Choices: " + Arrays.toString(Weapon.values());
    }

    protected String displayResults(Match match) {
        String message = "You chose " + match.getAggressor() + "\n";
        String matchResult = new Match(match.getAggressor(), match.getDefender()).determineWinner();

        if (matchResult.equals("stalemate"))
            return message + stalemateResponse();
        return message + winningResponse(match, matchResult);
    }

    private String winningResponse(Match match, String matchResult) {
        return "The winner of " + match.getAggressor() +
                " vs " + match.getDefender() +
                " is " + matchResult;
    }

    private String stalemateResponse() {
        return "So did your opponent!\nNo one wins.";
    }
}