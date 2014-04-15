package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponFactory;
import org.junit.Before;
import org.junit.Test;

import static factory.WeaponType.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LizardTest {
    private Weapon lizard;

    @Before
    public void setUp() throws Exception {
        lizard = WeaponFactory.buildWeapon(LIZARD);
    }

    @Test
    public void lizardDoesNotBeatScissors() {
        assertThat(lizard.determineWinner(SCISSORS), is(SCISSORS));
    }
    @Test
    public void lizardBeatsPaper() {
        assertThat(lizard.determineWinner(PAPER), is(LIZARD));
    }

    @Test
    public void lizardDoesNotBeatRock() {
        assertThat(lizard.determineWinner(ROCK), is(ROCK));
    }

    @Test
    public void lizardBeatsSpock() {
        assertThat(lizard.determineWinner(SPOCK), is(LIZARD));
    }

    @Test
    public void LizardIsDecapitatedByScissors() {
        assertThat(lizard.attack(SCISSORS), is("LIZARD is decapitated by SCISSORS."));
    }

    @Test
    public void lizardEatsPaper() {
        assertThat(lizard.attack(PAPER), is("LIZARD eats PAPER."));
    }

    @Test
    public void lizardIsCrushedByRock() {
        assertThat(lizard.attack(ROCK), is("LIZARD is crushed by ROCK."));
    }

    @Test
    public void lizardPoisonsSpock() {
        assertThat(lizard.attack(SPOCK), is("LIZARD poisons SPOCK."));
    }

}