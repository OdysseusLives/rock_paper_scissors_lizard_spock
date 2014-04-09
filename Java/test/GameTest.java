import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class GameTest {

    private BufferedReader br;
    private String matchResults;

    @Before
    public void setUp() throws Exception {
        br = mock(BufferedReader.class);
    }

    @Test
    public void displaysWeaponChoicesToAUser() throws IOException {
        matchResults = new Game().displayWeaponChoices();
        assertThat(matchResults.contains("Choices: "), is(true));
    }

    @Test
    public void letsPlayerChooseAWeapon() throws IOException {
        when(br.readLine()).thenReturn("paper");
        matchResults = new Game().readWeaponChoice(br);
        verify(br, times(1)).readLine();
    }

    @Test
    public void letsPlayerSeeChosenWeapon() throws IOException {
        matchResults = new Game().displayResults(mock(Weapon.class));
        assertThat(matchResults.contains("You chose "), is(true));
    }

    @Test
    public void returnsWinner() throws IOException {
        matchResults = new Game().displayResults(Weapon.PAPER);
        assertThat(matchResults.contains("The winner of ROCK vs PAPER is PAPER"), is(true));
    }
}
