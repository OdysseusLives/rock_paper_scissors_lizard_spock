public class Match {
    private Weapon aggressor;
    private Weapon defender;

    public Match(Weapon aggressor, Weapon defender) {
        this.aggressor = aggressor;
        this.defender = defender;
    }

    public Weapon winningMove() {
        if (aggressorWins())
            return aggressor;
        else
            return defender;
    }

    private boolean aggressorWins() {
        int aggressorValue = Weapon.getValue(aggressor);
        int defender_value = Weapon.getValue(defender);

        int difference = aggressorValue - defender_value;
        int modulus = difference % 2;

        return matchesAggressorPattern(difference, modulus);
    }

    private boolean matchesAggressorPattern(int difference, int modulus) {
        return (difference > 0 && modulus == 0) || (difference < 0 && modulus == -1);
    }
}
