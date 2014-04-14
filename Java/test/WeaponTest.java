import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class WeaponTest {
    @Test
    public void scissorsBeatsPaper() {
        assertThat(Weapon.SCISSORS.determineWinner(Weapon.PAPER), is(Weapon.SCISSORS));
    }

    @Test
    public void scissorsDoesNotBeatRock() {
        assertThat(Weapon.SCISSORS.determineWinner(Weapon.ROCK), is(Weapon.ROCK));
    }

    @Test
    public void scissorsBeatsLizard() {
        assertThat(Weapon.SCISSORS.determineWinner(Weapon.LIZARD), is(Weapon.SCISSORS));
    }

    @Test
    public void scissorsDoesNotBeatSpock() {
        assertThat(Weapon.SCISSORS.determineWinner(Weapon.SPOCK), is(Weapon.SPOCK));
    }

    @Test
    public void paperBeatsRock() {
        assertThat(Weapon.PAPER.determineWinner(Weapon.ROCK), is(Weapon.PAPER));
    }

    @Test
    public void paperDoesNotBeatLizard() {
        assertThat(Weapon.PAPER.determineWinner(Weapon.LIZARD), is(Weapon.LIZARD));
    }

    @Test
    public void paperBeatsSpock() {
        assertThat(Weapon.PAPER.determineWinner(Weapon.SPOCK), is(Weapon.PAPER));
    }


    @Test
    public void rockBeatsLizard() {
        assertThat(Weapon.ROCK.determineWinner(Weapon.LIZARD), is(Weapon.ROCK));
    }

    @Test
    public void rockDoesNotBeatSpock() {
        assertThat(Weapon.ROCK.determineWinner(Weapon.SPOCK), is(Weapon.SPOCK));
    }

    @Test
    public void lizardBeatsSpock() {
        assertThat(Weapon.LIZARD.determineWinner(Weapon.SPOCK), is(Weapon.LIZARD));
    }

    @Test
    public void getRandomWeapon() {
        assertThat(Weapon.getRandomWeapon(), is(notNullValue(Weapon.class)));
    }

    @Test
    public void displaysWeaponChoicesToAUser() {
        assertThat(Weapon.choices(), containsString("Choices: "));
        assertThat(Weapon.choices(), containsString(Weapon.ROCK.toString()));
        assertThat(Weapon.choices(), containsString(Weapon.PAPER.toString()));
        assertThat(Weapon.choices(), containsString(Weapon.SCISSORS.toString()));
        assertThat(Weapon.choices(), containsString(Weapon.LIZARD.toString()));
        assertThat(Weapon.choices(), containsString(Weapon.SPOCK.toString()));
    }

    @Test
    public void scissorsCutPaper() {
        assertThat(Weapon.SCISSORS.attack(Weapon.PAPER), is("SCISSORS cut PAPER."));
    }

    @Test
    public void scissorsIsCrushedByRock() {
        assertThat(Weapon.SCISSORS.attack(Weapon.ROCK), is("SCISSORS is crushed by ROCK."));
    }

    @Test
    public void scissorsDecapitateLizard() {
        assertThat(Weapon.SCISSORS.attack(Weapon.LIZARD), is("SCISSORS decapitate LIZARD."));
    }

    @Test
    public void scissorsIsSmashedBySpock() {
        assertThat(Weapon.SCISSORS.attack(Weapon.SPOCK), is("SCISSORS is smashed by SPOCK."));
    }

    @Test
    public void paperIsCutByScissors() {
        assertThat(Weapon.PAPER.attack(Weapon.SCISSORS), is("PAPER is cut by SCISSORS."));
    }

    @Test
    public void paperCoversRock() {
        assertThat(Weapon.PAPER.attack(Weapon.ROCK), is("PAPER covers ROCK."));
    }

    @Test
    public void paperIsEatenByLizard() {
        assertThat(Weapon.PAPER.attack(Weapon.LIZARD), is("PAPER is eaten by LIZARD."));
    }

    @Test
    public void paperDisprovesSpock() {
        assertThat(Weapon.PAPER.attack(Weapon.SPOCK), is("PAPER disproves SPOCK."));
    }

    @Test
    public void rockCrushesScissors() {
        assertThat(Weapon.ROCK.attack(Weapon.SCISSORS), is("ROCK crushes SCISSORS."));
    }

    @Test
    public void rockIsCoveredByPaper() {
        assertThat(Weapon.ROCK.attack(Weapon.PAPER), is("ROCK is covered by PAPER."));
    }

    @Test
    public void rockCrushesLizard() {
        assertThat(Weapon.ROCK.attack(Weapon.LIZARD), is("ROCK crushes LIZARD."));
    }

    @Test
    public void rockIsVaporizedBySpock() {
        assertThat(Weapon.ROCK.attack(Weapon.SPOCK), is("ROCK is vaporized by SPOCK."));
    }

    @Test
    public void LizardIsDecapitatedByScissors() {
        assertThat(Weapon.LIZARD.attack(Weapon.SCISSORS), is("LIZARD is decapitated by SCISSORS."));
    }

    @Test
    public void lizardEatsPaper() {
        assertThat(Weapon.LIZARD.attack(Weapon.PAPER), is("LIZARD eats PAPER."));
    }

    @Test
    public void lizardIsCrushedByRock() {
        assertThat(Weapon.LIZARD.attack(Weapon.ROCK), is("LIZARD is crushed by ROCK."));
    }

    @Test
    public void lizardPoisonsSpock() {
        assertThat(Weapon.LIZARD.attack(Weapon.SPOCK), is("LIZARD poisons SPOCK."));
    }

    @Test
    public void spockSmashesScissors() {
        assertThat(Weapon.SPOCK.attack(Weapon.SCISSORS), is("SPOCK smashes SCISSORS."));
    }

    @Test
    public void spockIsDisprovedByPaper() {
        assertThat(Weapon.SPOCK.attack(Weapon.PAPER), is("SPOCK is disproved by PAPER."));
    }

    @Test
    public void spockIsVaporizedBySpock() {
        assertThat(Weapon.SPOCK.attack(Weapon.ROCK), is("SPOCK vaporizes ROCK."));
    }

    @Test
    public void spockCrushesLizard() {
        assertThat(Weapon.SPOCK.attack(Weapon.LIZARD), is("SPOCK is poisoned by LIZARD."));
    }

}
