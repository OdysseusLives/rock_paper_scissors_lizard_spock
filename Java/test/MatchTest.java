import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MatchTest {
    @Test
    public void shouldDetermineWinnerBetweenScissorsAndPaperAsScissors() {
        assertThat(new Match().determineWinner(Weapon.PAPER, Weapon.SCISSORS), is(Weapon.SCISSORS));
    }
}