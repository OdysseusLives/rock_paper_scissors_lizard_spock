import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MatchTest {

    @Test
    public void WinningMove_LetsAggressorWin() {
        assertThat(new Match(Weapon.SCISSORS, Weapon.PAPER).winningMove(), is(Weapon.SCISSORS));
    }

    @Test
    public void WinningMove_LetsDefenderWin() {
        assertThat(new Match(Weapon.PAPER, Weapon.SCISSORS).winningMove(), is(Weapon.SCISSORS));
    }

    @Test
    public void WinningMove_LetsLastWeaponBeatFirstWeapon() {
        assertThat(new Match(Weapon.ROCK, Weapon.SCISSORS).winningMove(), is(Weapon.ROCK));
    }
}
