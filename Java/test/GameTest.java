import factory.weaponTypes.Paper;
import factory.weaponTypes.Rock;
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
        matchResults = new Game().results(new Match(new Rock(), new Paper()));
        assertThat(matchResults, containsString("ROCK is covered by PAPER."));
    }

    @Test
    public void hasUsefulStalemateMessage() throws IOException {
        matchResults = new Game().results(new Match(new Rock(), new Rock()));
        assertThat(matchResults, containsString("No one wins."));
    }
}
