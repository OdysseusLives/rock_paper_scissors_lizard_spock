public class Game {
    Player person = new Player();
    Player machine = new Player();

    public void play() throws Exception {
        System.out.println(displayWeaponChoices());
        person.chooseWeapon();
        machine.generateWeapon();
        Match match = new Match(person.getWeapon(), machine.getWeapon());

        System.out.println(results(match));
    }

    protected String results(Match match) {
        return match.results();
    }

    protected String displayWeaponChoices() {
        return Weapon.choices();
    }

}