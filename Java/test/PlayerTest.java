import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class PlayerTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void aPlayerKnowsTheirCurrentWeapon() {
        Player player = new Player();
        player.setWeapon(Weapon.SCISSORS);
        assertThat(player.getWeapon(), is(Weapon.SCISSORS));
    }

    @Test
    public void aPlayerCanGenerateAWeapon() {
        Player player = new Player();
        player.generateWeapon();
        assertThat(player.getWeapon(), is(notNullValue(Weapon.class)));
    }

    @Test
    public void readWeaponChoice_ReadsInAPlayersChosenWeapon() throws Exception {
        BufferedReader br = mock(BufferedReader.class);
        when(br.readLine()).thenReturn("paper");
        new Player().readWeaponChoice(br);
        verify(br, times(1)).readLine();
    }

    @Test
    public void readWeaponChoice_letsPlayerInputAWeapon() throws Exception {
        BufferedReader br = mock(BufferedReader.class);
        when(br.readLine()).thenReturn("paper");

        Player player = new Player();

        assertThat(player.readWeaponChoice(br), is("paper"));
    }

    @Test
    public void readWeaponChoice_throwsExceptionWithIOError() throws IOException {
        thrown.expect(IOException.class);
        thrown.expectMessage("IO error trying to read your weapon!");

        BufferedReader br = mock(BufferedReader.class);
        when(br.readLine()).thenThrow(IOException.class);

        new Player().readWeaponChoice(br);
    }

    @Test
    public void returnWeaponChoice_letsPlayerChooseAWeapon() throws Exception {
        Player player = new Player();
        assertThat(player.returnWeaponChoice("paper"), is(Weapon.PAPER));
    }

    @Test
    public void returnWeaponChoice_throwsExceptionWhenInvalidWeaponIsEntered() throws EnumConstantNotPresentException {
        thrown.expect(EnumConstantNotPresentException.class);
        thrown.expectMessage("Invalid weapon choice!");

        new Player().returnWeaponChoice("giraffe");
    }

}
