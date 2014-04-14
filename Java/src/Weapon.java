import java.util.*;

import static java.util.Arrays.asList;

public enum Weapon {
    SCISSORS {
        protected List<Weapon> weaponsThatIBeat() {
            return asList(Weapon.PAPER, Weapon.LIZARD);
        }

        protected Map<Weapon, String> technique() {
            Map<Weapon, String> destruction = new TreeMap<>();
            destruction.put(Weapon.PAPER, "cut");
            destruction.put(Weapon.ROCK, "is crushed by");
            destruction.put(Weapon.LIZARD, "decapitate");
            destruction.put(Weapon.SPOCK, "is smashed by");
            return destruction;
        }

    }, PAPER {
        protected List<Weapon> weaponsThatIBeat() {
            return asList(Weapon.ROCK, Weapon.SPOCK);
        }

        protected Map<Weapon, String> technique() {
            Map<Weapon, String> destruction = new TreeMap<>();
            destruction.put(Weapon.SCISSORS, "is cut by");
            destruction.put(Weapon.ROCK, "covers");
            destruction.put(Weapon.LIZARD, "is eaten by");
            destruction.put(Weapon.SPOCK, "disproves");
            return destruction;
        }

    }, ROCK {
        protected List<Weapon> weaponsThatIBeat() {
            return asList(Weapon.SCISSORS, Weapon.LIZARD);
        }

        protected Map<Weapon, String> technique() {
            Map<Weapon, String> destruction = new TreeMap<>();
            destruction.put(Weapon.SCISSORS, "crushes");
            destruction.put(Weapon.PAPER, "is covered by");
            destruction.put(Weapon.LIZARD, "crushes");
            destruction.put(Weapon.SPOCK, "is vaporized by");
            return destruction;
        }
    },
    LIZARD {
        protected List<Weapon> weaponsThatIBeat() {
            return asList(Weapon.PAPER, Weapon.SPOCK);
        }

        protected Map<Weapon, String> technique() {
            Map<Weapon, String> destruction = new TreeMap<>();
            destruction.put(Weapon.SCISSORS, "is decapitated by");
            destruction.put(Weapon.PAPER, "eats");
            destruction.put(Weapon.ROCK, "is crushed by");
            destruction.put(Weapon.SPOCK, "poisons");
            return destruction;
        }
    },
    SPOCK {
        protected List<Weapon> weaponsThatIBeat() {
            return asList(Weapon.SCISSORS, Weapon.ROCK);
        }

        protected Map<Weapon, String> technique() {
            Map<Weapon, String> destruction = new TreeMap<>();
            destruction.put(Weapon.SCISSORS, "smashes");
            destruction.put(Weapon.PAPER, "is disproved by");
            destruction.put(Weapon.ROCK, "vaporizes");
            destruction.put(Weapon.LIZARD, "is poisoned by");
            return destruction;
        }
    };

    public Weapon determineWinner(Weapon weapon){
        if (weaponsThatIBeat().contains(weapon))
            return this;
        return weapon;
    }

    protected abstract List<Weapon> weaponsThatIBeat();

    public static Weapon getRandomWeapon() {
        return values()[(int) (Math.random() * values().length)];
    }

    public static String choices() {
        return "Enter your weapon selection:" + "\n" +
                "Choices: " + Arrays.toString(Weapon.values());
    }

    public String attack(Weapon weapon) {
        return String.format("%s %s %s.", this, technique().get(weapon), weapon);
    }

    protected abstract Map<Weapon, String> technique();
}