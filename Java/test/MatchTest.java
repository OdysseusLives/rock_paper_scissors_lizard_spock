import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MatchTest {
    @Test
    public void returnsWinner() throws IOException {
        Match match = new Match(Weapon.ROCK, Weapon.PAPER);
        assertThat(match.results(), containsString("You chose ROCK."));
        assertThat(match.results(), containsString("ROCK is covered by PAPER"));
    }

    @Test
    public void hasUsefulStalemateMessage() throws IOException {
        Match match = new Match(Weapon.ROCK, Weapon.ROCK);

        assertThat(match.results(), containsString("You chose ROCK."));
        assertThat(match.results(), containsString("So did your opponent!"));
        assertThat(match.results(), containsString("No one wins."));
    }

    @Test
    public void shouldDetermineAStalemate() {
        assertThat(new Match(Weapon.PAPER, Weapon.PAPER).isAStalemate(), is(true));
    }
}