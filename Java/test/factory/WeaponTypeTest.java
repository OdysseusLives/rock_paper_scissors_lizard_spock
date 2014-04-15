package factory;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class WeaponTypeTest {
    @Test
    public void shouldHaveScissors() {
        assertThat(WeaponType.valueOf("scissors".toUpperCase()), is(WeaponType.SCISSORS));
    }
    
    @Test
    public void shouldHavePaper() {
        assertThat(WeaponType.valueOf("paper".toUpperCase()), is(WeaponType.PAPER));
    }
    
    @Test
    public void shouldHaveRock() {
        assertThat(WeaponType.valueOf("rock".toUpperCase()), is(WeaponType.ROCK));
    }
    
    @Test
    public void shouldHaveLizard() {
        assertThat(WeaponType.valueOf("lizard".toUpperCase()), is(WeaponType.LIZARD));
    }
    
    @Test
    public void shouldHaveSpock() {
        assertThat(WeaponType.valueOf("spock".toUpperCase()), is(WeaponType.SPOCK));
    }

    @Test
    public void getRandomWeapon() {
        assertThat(WeaponType.getRandomWeapon(), is(notNullValue(WeaponType.class)));
    }

    @Test
    public void displaysWeaponChoicesToAUser() {
        assertThat(WeaponType.choices(), containsString("Choices: "));
        assertThat(WeaponType.choices(), containsString(WeaponType.ROCK.toString()));
        assertThat(WeaponType.choices(), containsString(WeaponType.PAPER.toString()));
        assertThat(WeaponType.choices(), containsString(WeaponType.SCISSORS.toString()));
        assertThat(WeaponType.choices(), containsString(WeaponType.LIZARD.toString()));
        assertThat(WeaponType.choices(), containsString(WeaponType.SPOCK.toString()));
    }
}
