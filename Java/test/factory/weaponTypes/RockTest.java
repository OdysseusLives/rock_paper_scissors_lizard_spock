package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponFactory;
import factory.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RockTest {

    private Weapon rock;

    @Before
    public void setUp() throws Exception {
        rock = WeaponFactory.buildWeapon(WeaponType.ROCK);
    }

    @Test
    public void rockBeatsScissors() {
        assertThat(rock.determineWinner(WeaponType.SCISSORS), is(WeaponType.ROCK));
    }

    @Test
    public void rockDoesNotBeatPaper() {
        assertThat(rock.determineWinner(WeaponType.PAPER), is(WeaponType.PAPER));
    }

    @Test
    public void rockBeatsLizard() {
        assertThat(rock.determineWinner(WeaponType.LIZARD), is(WeaponType.ROCK));
    }

    @Test
    public void rockDoesNotBeatSpock() {
        assertThat(rock.determineWinner(WeaponType.SPOCK), is(WeaponType.SPOCK));
    }

    @Test
    public void rockCrushesScissors() {
        assertThat(rock.attack(WeaponType.SCISSORS), is("ROCK crushes SCISSORS."));
    }

    @Test
    public void rockIsCoveredByPaper() {
        assertThat(rock.attack(WeaponType.PAPER), is("ROCK is covered by PAPER."));
    }

    @Test
    public void rockCrushesLizard() {
        assertThat(rock.attack(WeaponType.LIZARD), is("ROCK crushes LIZARD."));
    }

    @Test
    public void rockIsVaporizedBySpock() {
        assertThat(rock.attack(WeaponType.SPOCK), is("ROCK is vaporized by SPOCK."));
    }

}
