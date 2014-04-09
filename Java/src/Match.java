public class Match {
    public String determineWinner(Weapon aggressor, Weapon defender) {
        if (aggressor.equals(defender))
            return "stalemate";
        return aggressor.determineWinner(defender).toString();
    }
}