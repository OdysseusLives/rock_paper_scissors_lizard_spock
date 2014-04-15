package factory;

import org.junit.Test;

import static factory.WeaponType.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class WeaponTypeTest {
    @Test
    public void shouldHaveScissors() {
        assertThat(valueOf("scissors".toUpperCase()), is(SCISSORS));
    }
    
    @Test
    public void shouldHavePaper() {
        assertThat(valueOf("paper".toUpperCase()), is(PAPER));
    }
    
    @Test
    public void shouldHaveRock() {
        assertThat(valueOf("rock".toUpperCase()), is(ROCK));
    }
    
    @Test
    public void shouldHaveLizard() {
        assertThat(valueOf("lizard".toUpperCase()), is(LIZARD));
    }
    
    @Test
    public void shouldHaveSpock() {
        assertThat(valueOf("spock".toUpperCase()), is(SPOCK));
    }

    @Test
    public void getRandomWeapon() {
        assertThat(WeaponType.getRandomWeapon(), is(notNullValue(WeaponType.class)));
    }

    @Test
    public void displaysWeaponChoicesToAUser() {
        assertThat(choices(), containsString("Choices: "));
        assertThat(choices(), containsString(ROCK.toString()));
        assertThat(choices(), containsString(PAPER.toString()));
        assertThat(choices(), containsString(SCISSORS.toString()));
        assertThat(choices(), containsString(LIZARD.toString()));
        assertThat(choices(), containsString(SPOCK.toString()));
    }
}
