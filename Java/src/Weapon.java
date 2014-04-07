public enum Weapon {
    SCISSORS(1), PAPER(2), ROCK(3);
    private int value;

    private Weapon(int value) {
        this.value = value;
    }

    public static int getValue(Weapon weapon) { return weapon.value; };
}