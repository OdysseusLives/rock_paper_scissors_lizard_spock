import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MatchTest {

    @Test
    public void WinningMove_LetsAggressorWin() {
        assertThat(new Match("scissors", "paper").winningMove(), is("scissors"));
    }
}