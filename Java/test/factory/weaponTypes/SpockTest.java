package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponFactory;
import org.junit.Before;
import org.junit.Test;

import static factory.WeaponType.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SpockTest {
    private Weapon spock;

    @Before
    public void setUp() throws Exception {
        spock = WeaponFactory.buildWeapon(SPOCK);
    }

    @Test
    public void spockBeatsScissors() {
        assertThat(spock.determineWinner(SCISSORS), is(SPOCK));
    }

    @Test
    public void spockDoesNotBeatPaper() {
        assertThat(spock.determineWinner(PAPER), is(PAPER));
    }

    @Test
    public void spockBeatsRock() {
        assertThat(spock.determineWinner(ROCK), is(SPOCK));
    }

    @Test
    public void spockDoesNotBeatLizard() {
        assertThat(spock.determineWinner(LIZARD), is(LIZARD));
    }

    @Test
    public void spockSmashesScissors() {
        assertThat(spock.attack(SCISSORS), is("SPOCK smashes SCISSORS."));
    }

    @Test
    public void spockIsDisprovedByPaper() {
        assertThat(spock.attack(PAPER), is("SPOCK is disproved by PAPER."));
    }

    @Test
    public void spockIsVaporizedBySpock() {
        assertThat(spock.attack(ROCK), is("SPOCK vaporizes ROCK."));
    }

    @Test
    public void spockCrushesLizard() {
        assertThat(spock.attack(LIZARD), is("SPOCK is poisoned by LIZARD."));
    }
}