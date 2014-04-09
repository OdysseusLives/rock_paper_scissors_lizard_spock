import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WeaponTest {
    @Test
    public void scissorsBeatsPaper() {
        assertThat(Weapon.SCISSORS.determineWinner(Weapon.PAPER), is(Weapon.SCISSORS));
    }

    @Test
    public void scissorsDoesNotBeatRock() {
        assertThat(Weapon.SCISSORS.determineWinner(Weapon.ROCK), is(Weapon.ROCK));
    }

    @Test
    public void scissorsBeatsLizard() {
        assertThat(Weapon.SCISSORS.determineWinner(Weapon.LIZARD), is(Weapon.SCISSORS));
    }

    @Test
    public void scissorsDoesNotBeatSpock() {
        assertThat(Weapon.SCISSORS.determineWinner(Weapon.SPOCK), is(Weapon.SPOCK));
    }

    @Test
    public void paperBeatsRock() {
        assertThat(Weapon.PAPER.determineWinner(Weapon.ROCK), is(Weapon.PAPER));
    }

    @Test
    public void paperDoesNotBeatLizard() {
        assertThat(Weapon.PAPER.determineWinner(Weapon.LIZARD), is(Weapon.LIZARD));
    }

    @Test
    public void paperBeatsSpock() {
        assertThat(Weapon.PAPER.determineWinner(Weapon.SPOCK), is(Weapon.PAPER));
    }


    @Test
    public void rockBeatsLizard() {
        assertThat(Weapon.ROCK.determineWinner(Weapon.LIZARD), is(Weapon.ROCK));
    }

    @Test
    public void rockDoesNotBeatSpock() {
        assertThat(Weapon.ROCK.determineWinner(Weapon.SPOCK), is(Weapon.SPOCK));
    }

    @Test
    public void lizardBeatsSpock() {
        assertThat(Weapon.LIZARD.determineWinner(Weapon.SPOCK), is(Weapon.LIZARD));
    }

}
