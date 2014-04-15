import factory.WeaponFactory;
import org.junit.Test;

import java.io.IOException;

import static factory.WeaponType.PAPER;
import static factory.WeaponType.ROCK;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class MatchTest {
    @Test
    public void returnsWinner() throws IOException {
        Match match = new Match(WeaponFactory.buildWeapon(ROCK), WeaponFactory.buildWeapon(PAPER));
        assertThat(match.results(), containsString("You chose ROCK."));
        assertThat(match.results(), containsString("ROCK is covered by PAPER"));
    }

    @Test
    public void hasUsefulStalemateMessage() throws IOException {
        Match match = new Match(WeaponFactory.buildWeapon(ROCK), WeaponFactory.buildWeapon(ROCK));

        assertThat(match.results(), containsString("You chose ROCK."));
        assertThat(match.results(), containsString("So did your opponent!"));
        assertThat(match.results(), containsString("No one wins."));
    }
}