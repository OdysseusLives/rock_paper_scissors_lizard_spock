import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class MatchTest {

    private BufferedReader br;

    @Before
    public void setUp() throws Exception {
        br = mock(BufferedReader.class);
    }

    @Test
    public void displaysWeaponChoicesToAUser() throws IOException {
        when(br.readLine()).thenReturn("rock");

        String matchResults = new Match().run(br);

        assertThat(matchResults.contains("Choices: "), is(true));
    }

    @Test
    public void letsPlayerChooseAWeapon() throws IOException {
        when(br.readLine()).thenReturn("rock");

        new Match().run(br);

        verify(br, times(1)).readLine();
    }

    @Test
    public void letsPlayerSeeChoice() throws IOException {
        when(br.readLine()).thenReturn("rock");

        String matchResults = new Match().run(br);

        assertThat(matchResults.contains("You chose "), is(true));
    }

    @Test
    public void returnsWinner() throws IOException {
        when(br.readLine()).thenReturn("paper");

        String matchResults = new Match().run(br);

        assertThat(matchResults.contains("The winner of ROCK vs PAPER is PAPER"), is(true));
    }
}
