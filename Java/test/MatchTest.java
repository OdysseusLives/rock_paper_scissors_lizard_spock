import factory.WeaponFactory;
import factory.WeaponType;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class MatchTest {
    @Test
    public void returnsWinner() throws IOException {
        Match match = new Match(WeaponFactory.buildWeapon(WeaponType.ROCK), WeaponFactory.buildWeapon(WeaponType.PAPER));
        assertThat(match.results(), containsString("You chose ROCK."));
        assertThat(match.results(), containsString("ROCK is covered by PAPER"));
    }

    @Test
    public void hasUsefulStalemateMessage() throws IOException {
        Match match = new Match(WeaponFactory.buildWeapon(WeaponType.ROCK), WeaponFactory.buildWeapon(WeaponType.ROCK));

        assertThat(match.results(), containsString("You chose ROCK."));
        assertThat(match.results(), containsString("So did your opponent!"));
        assertThat(match.results(), containsString("No one wins."));
    }
}