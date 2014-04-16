import factory.WeaponType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    Player person = new Player();
    Player machine = new Player();

    public void play() throws IOException {
        System.out.println(displayWeaponChoices());

        System.out.println(results(createMatch()));
    }

    private Match createMatch() throws IOException {
        person.chooseWeapon(new BufferedReader(new InputStreamReader(System.in)));
        machine.generateWeapon();
        return new Match(person.getWeapon(), machine.getWeapon());
    }

    protected String results(Match match) {
        return match.results();
    }

    protected String displayWeaponChoices() {
        return WeaponType.choices();
    }

}