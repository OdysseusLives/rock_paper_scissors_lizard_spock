package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponFactory;
import org.junit.Before;
import org.junit.Test;

import static factory.WeaponType.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RockTest {

    private Weapon rock;

    @Before
    public void setUp() throws Exception {
        rock = WeaponFactory.buildWeapon(ROCK);
    }

    @Test
    public void rockBeatsScissors() {
        assertThat(rock.determineWinner(SCISSORS), is(ROCK));
    }

    @Test
    public void rockDoesNotBeatPaper() {
        assertThat(rock.determineWinner(PAPER), is(PAPER));
    }

    @Test
    public void rockBeatsLizard() {
        assertThat(rock.determineWinner(LIZARD), is(ROCK));
    }

    @Test
    public void rockDoesNotBeatSpock() {
        assertThat(rock.determineWinner(SPOCK), is(SPOCK));
    }

    @Test
    public void rockCrushesScissors() {
        assertThat(rock.attack(SCISSORS), is("ROCK crushes SCISSORS."));
    }

    @Test
    public void rockIsCoveredByPaper() {
        assertThat(rock.attack(PAPER), is("ROCK is covered by PAPER."));
    }

    @Test
    public void rockCrushesLizard() {
        assertThat(rock.attack(LIZARD), is("ROCK crushes LIZARD."));
    }

    @Test
    public void rockIsVaporizedBySpock() {
        assertThat(rock.attack(SPOCK), is("ROCK is vaporized by SPOCK."));
    }

}
