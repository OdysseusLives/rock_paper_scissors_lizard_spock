import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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
        assertThat(new Match(Weapon.SPOCK, Weapon.SCISSORS).winningMove(), is(Weapon.SPOCK));
    }
}
