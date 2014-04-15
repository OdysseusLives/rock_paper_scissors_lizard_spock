package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponFactory;
import org.junit.Before;
import org.junit.Test;

import static factory.WeaponType.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PaperTest {

    private Weapon paper;

    @Before
    public void setUp() throws Exception {
        paper = WeaponFactory.buildWeapon(PAPER);
    }

    @Test
    public void paperDoesNotBeatScissors() {
        assertThat(paper.determineWinner(SCISSORS), is(SCISSORS));
    }
    @Test
    public void paperBeatsRock() {
        assertThat(paper.determineWinner(ROCK), is(PAPER));
    }

    @Test
    public void paperDoesNotBeatLizard() {
        assertThat(paper.determineWinner(LIZARD), is(LIZARD));
    }

    @Test
    public void paperBeatsSpock() {
        assertThat(paper.determineWinner(SPOCK), is(PAPER));
    }

    @Test
    public void paperIsCutByScissors() {
        assertThat(paper.attack(SCISSORS), is("PAPER is cut by SCISSORS."));
    }

    @Test
    public void paperCoversRock() {
        assertThat(paper.attack(ROCK), is("PAPER covers ROCK."));
    }

    @Test
    public void paperIsEatenByLizard() {
        assertThat(paper.attack(LIZARD), is("PAPER is eaten by LIZARD."));
    }

    @Test
    public void paperDisprovesSpock() {
        assertThat(paper.attack(SPOCK), is("PAPER disproves SPOCK."));
    }

}