import lombok.Data;

@Data
public class Match {
    Weapon aggressor;
    Weapon defender;

    public Match(Weapon aggressor, Weapon defender) {
        this.aggressor = aggressor;
        this.defender = defender;
    }
    public String determineWinner() {
        if (aggressor.equals(defender))
            return "stalemate";
        return aggressor.determineWinner(defender).toString();
    }
}