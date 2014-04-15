package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponFactory;
import factory.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PaperTest {

    private Weapon paper;

    @Before
    public void setUp() throws Exception {
        paper = WeaponFactory.buildWeapon(WeaponType.PAPER);
    }

    @Test
    public void paperDoesNotBeatScissors() {
        assertThat(paper.determineWinner(WeaponType.SCISSORS), is(WeaponType.SCISSORS));
    }
    @Test
    public void paperBeatsRock() {
        assertThat(paper.determineWinner(WeaponType.ROCK), is(WeaponType.PAPER));
    }

    @Test
    public void paperDoesNotBeatLizard() {
        assertThat(paper.determineWinner(WeaponType.LIZARD), is(WeaponType.LIZARD));
    }

    @Test
    public void paperBeatsSpock() {
        assertThat(paper.determineWinner(WeaponType.SPOCK), is(WeaponType.PAPER));
    }

    @Test
    public void paperIsCutByScissors() {
        assertThat(paper.attack(WeaponType.SCISSORS), is("PAPER is cut by SCISSORS."));
    }

    @Test
    public void paperCoversRock() {
        assertThat(paper.attack(WeaponType.ROCK), is("PAPER covers ROCK."));
    }

    @Test
    public void paperIsEatenByLizard() {
        assertThat(paper.attack(WeaponType.LIZARD), is("PAPER is eaten by LIZARD."));
    }

    @Test
    public void paperDisprovesSpock() {
        assertThat(paper.attack(WeaponType.SPOCK), is("PAPER disproves SPOCK."));
    }

}