package factory.weaponTypes;

import factory.Weapon;
import factory.WeaponFactory;
import factory.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LizardTest {
    private Weapon lizard;

    @Before
    public void setUp() throws Exception {
        lizard = WeaponFactory.buildWeapon(WeaponType.LIZARD);
    }

    @Test
    public void lizardDoesNotBeatScissors() {
        assertThat(lizard.determineWinner(WeaponType.SCISSORS), is(WeaponType.SCISSORS));
    }
    @Test
    public void lizardBeatsPaper() {
        assertThat(lizard.determineWinner(WeaponType.PAPER), is(WeaponType.LIZARD));
    }

    @Test
    public void lizardDoesNotBeatRock() {
        assertThat(lizard.determineWinner(WeaponType.ROCK), is(WeaponType.ROCK));
    }

    @Test
    public void lizardBeatsSpock() {
        assertThat(lizard.determineWinner(WeaponType.SPOCK), is(WeaponType.LIZARD));
    }

    @Test
    public void LizardIsDecapitatedByScissors() {
        assertThat(lizard.attack(WeaponType.SCISSORS), is("LIZARD is decapitated by SCISSORS."));
    }

    @Test
    public void lizardEatsPaper() {
        assertThat(lizard.attack(WeaponType.PAPER), is("LIZARD eats PAPER."));
    }

    @Test
    public void lizardIsCrushedByRock() {
        assertThat(lizard.attack(WeaponType.ROCK), is("LIZARD is crushed by ROCK."));
    }

    @Test
    public void lizardPoisonsSpock() {
        assertThat(lizard.attack(WeaponType.SPOCK), is("LIZARD poisons SPOCK."));
    }

}