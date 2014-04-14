import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
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

    @Test
    public void returnsWinner() throws IOException {
        Match match = new Match(Weapon.ROCK, Weapon.PAPER);
        assertThat(match.results(), containsString("You chose ROCK."));
        assertThat(match.results(), containsString("The winner of ROCK vs PAPER is PAPER"));
    }

    @Test
    public void hasUsefulStalemateMessage() throws IOException {
        Match match = new Match(Weapon.ROCK, Weapon.ROCK);

        assertThat(match.results(), containsString("You chose ROCK."));
        assertThat(match.results(), containsString("So did your opponent!"));
        assertThat(match.results(), containsString("No one wins."));
    }
}