import java.util.List;

import static java.util.Arrays.asList;

public enum Weapon {
    SCISSORS {
        protected List<Weapon> weaponsThatIBeat() {
            return asList(Weapon.PAPER, Weapon.LIZARD);
        }
    }, PAPER {
        protected List<Weapon> weaponsThatIBeat() {
            return asList(Weapon.ROCK, Weapon.SPOCK);
        }

    }, ROCK {
        protected List<Weapon> weaponsThatIBeat() {
            return asList(Weapon.SCISSORS, Weapon.LIZARD);
        }
    },
    LIZARD {
        protected List<Weapon> weaponsThatIBeat() {
            return asList(Weapon.PAPER, Weapon.SPOCK);
        }
    },
    SPOCK {
        protected List<Weapon> weaponsThatIBeat() {
            return asList(Weapon.SCISSORS, Weapon.ROCK);
        }
    };

    public Weapon determineWinner(Weapon weapon){
        if (weaponsThatIBeat().contains(weapon))
            return this;
        return weapon;
    }

    protected abstract List<Weapon> weaponsThatIBeat();

}