package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponFactory;
import factory.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ScissorsTest {

    private Weapon scissors;

    @Before
    public void setUp() throws Exception {
        scissors = WeaponFactory.buildWeapon(WeaponType.SCISSORS);
    }

    @Test
    public void scissorsBeatsPaper() {
        assertThat(scissors.determineWinner(WeaponType.PAPER), is(WeaponType.SCISSORS));
    }

    @Test
    public void scissorsDoesNotBeatRock() {
        assertThat(scissors.determineWinner(WeaponType.ROCK), is(WeaponType.ROCK));
    }

    @Test
    public void scissorsBeatsLizard() {
        assertThat(scissors.determineWinner(WeaponType.LIZARD), is(WeaponType.SCISSORS));
    }

    @Test
    public void scissorsDoesNotBeatSpock() {
        assertThat(scissors.determineWinner(WeaponType.SPOCK), is(WeaponType.SPOCK));
    }

    @Test
    public void scissorsCutPaper() {
        assertThat(scissors.attack(WeaponType.PAPER), is("SCISSORS cut PAPER."));
    }

    @Test
    public void scissorsIsCrushedByRock() {
        assertThat(scissors.attack(WeaponType.ROCK), is("SCISSORS is crushed by ROCK."));
    }

    @Test
    public void scissorsDecapitateLizard() {
        assertThat(scissors.attack(WeaponType.LIZARD), is("SCISSORS decapitate LIZARD."));
    }

    @Test
    public void scissorsIsSmashedBySpock() {
        assertThat(scissors.attack(WeaponType.SPOCK), is("SCISSORS is smashed by SPOCK."));
    }

}
