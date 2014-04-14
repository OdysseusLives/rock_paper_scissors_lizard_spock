import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameTest {

    private String matchResults;

    @Test
    public void displaysWeaponChoicesToAUser() throws IOException {
        matchResults = new Game().displayWeaponChoices();
        assertThat(matchResults.contains("Choices: "), is(true));
    }

    @Test
    public void returnsWinner() throws IOException {
        matchResults = new Game().results(new Match(Weapon.ROCK, Weapon.PAPER));
        assertThat(matchResults.contains("The winner of ROCK vs PAPER is PAPER"), is(true));
    }

    @Test
    public void hasUsefulStalemateMessage() throws IOException {
        matchResults = new Game().results(new Match(Weapon.ROCK, Weapon.ROCK));
        assertThat(matchResults.contains("No one wins."), is(true));
    }
}
