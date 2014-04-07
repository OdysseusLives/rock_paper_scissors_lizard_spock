public enum Weapon {
    SCISSORS(1), PAPER(2), ROCK(3), LIZARD(4), SPOCK(5);
    private int value;

    private Weapon(int value) {
        this.value = value;
    }

    public static int getValue(Weapon weapon) { return weapon.value; };
}