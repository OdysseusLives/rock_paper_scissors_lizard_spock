package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponFactory;
import factory.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SpockTest {
    private Weapon spock;

    @Before
    public void setUp() throws Exception {
        spock = WeaponFactory.buildWeapon(WeaponType.SPOCK);
    }

    @Test
    public void spockBeatsScissors() {
        assertThat(spock.determineWinner(WeaponType.SCISSORS), is(WeaponType.SPOCK));
    }

    @Test
    public void spockDoesNotBeatPaper() {
        assertThat(spock.determineWinner(WeaponType.PAPER), is(WeaponType.PAPER));
    }

    @Test
    public void spockBeatsRock() {
        assertThat(spock.determineWinner(WeaponType.ROCK), is(WeaponType.SPOCK));
    }

    @Test
    public void spockDoesNotBeatLizard() {
        assertThat(spock.determineWinner(WeaponType.LIZARD), is(WeaponType.LIZARD));
    }

    @Test
    public void spockSmashesScissors() {
        assertThat(spock.attack(WeaponType.SCISSORS), is("SPOCK smashes SCISSORS."));
    }

    @Test
    public void spockIsDisprovedByPaper() {
        assertThat(spock.attack(WeaponType.PAPER), is("SPOCK is disproved by PAPER."));
    }

    @Test
    public void spockIsVaporizedBySpock() {
        assertThat(spock.attack(WeaponType.ROCK), is("SPOCK vaporizes ROCK."));
    }

    @Test
    public void spockCrushesLizard() {
        assertThat(spock.attack(WeaponType.LIZARD), is("SPOCK is poisoned by LIZARD."));
    }
}