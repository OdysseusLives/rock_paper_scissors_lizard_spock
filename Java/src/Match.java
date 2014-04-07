public class Match {
    private String aggressor;
    private String defender;

    public Match(String aggressor, String defender) {
        this.aggressor = aggressor;
        this.defender = defender;
    }

    public String winningMove() {
        return aggressor;
    }
}
