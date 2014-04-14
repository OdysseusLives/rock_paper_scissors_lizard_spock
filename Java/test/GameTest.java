import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class GameTest {

    private String matchResults;

    @Test
    public void displaysWeaponChoicesToAUser() throws IOException {
        matchResults = new Game().displayWeaponChoices();
        assertThat(matchResults, containsString("Choices: "));
    }

    @Test
    public void returnsWinner() throws IOException {
        matchResults = new Game().results(new Match(Weapon.ROCK, Weapon.PAPER));
        assertThat(matchResults, containsString("ROCK is covered by PAPER."));
    }

    @Test
    public void hasUsefulStalemateMessage() throws IOException {
        matchResults = new Game().results(new Match(Weapon.ROCK, Weapon.ROCK));
        assertThat(matchResults, containsString("No one wins."));
    }
}
