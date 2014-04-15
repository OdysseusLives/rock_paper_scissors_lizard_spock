package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponFactory;
import org.junit.Before;
import org.junit.Test;

import static factory.WeaponType.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ScissorsTest {

    private Weapon scissors;

    @Before
    public void setUp() throws Exception {
        scissors = WeaponFactory.buildWeapon(SCISSORS);
    }

    @Test
    public void scissorsBeatsPaper() {
        assertThat(scissors.determineWinner(PAPER), is(SCISSORS));
    }

    @Test
    public void scissorsDoesNotBeatRock() {
        assertThat(scissors.determineWinner(ROCK), is(ROCK));
    }

    @Test
    public void scissorsBeatsLizard() {
        assertThat(scissors.determineWinner(LIZARD), is(SCISSORS));
    }

    @Test
    public void scissorsDoesNotBeatSpock() {
        assertThat(scissors.determineWinner(SPOCK), is(SPOCK));
    }

    @Test
    public void scissorsCutPaper() {
        assertThat(scissors.attack(PAPER), is("SCISSORS cut PAPER."));
    }

    @Test
    public void scissorsIsCrushedByRock() {
        assertThat(scissors.attack(ROCK), is("SCISSORS is crushed by ROCK."));
    }

    @Test
    public void scissorsDecapitateLizard() {
        assertThat(scissors.attack(LIZARD), is("SCISSORS decapitate LIZARD."));
    }

    @Test
    public void scissorsIsSmashedBySpock() {
        assertThat(scissors.attack(SPOCK), is("SCISSORS is smashed by SPOCK."));
    }

}
