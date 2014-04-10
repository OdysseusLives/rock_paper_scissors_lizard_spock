import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MatchTest {
    @Test
    public void shouldDetermineWinnerBetweenScissorsAndPaperAsScissors() {
        assertThat(new Match(Weapon.PAPER, Weapon.SCISSORS).determineWinner(), is("SCISSORS"));
    }

    @Test
    public void shouldDetermineAStalemate() {
        assertThat(new Match(Weapon.PAPER, Weapon.PAPER).determineWinner(), is("stalemate"));
    }
}