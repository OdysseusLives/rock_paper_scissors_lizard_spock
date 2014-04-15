import factory.WeaponType;
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
        player.setWeaponType(WeaponType.SCISSORS);

        assertThat(player.getWeaponType(), is(WeaponType.SCISSORS));
    }

    @Test
    public void aPlayerCanGenerateAWeapon() {
        Player player = new Player();
        player.generateWeapon();

        assertThat(player.getWeaponType(), is(notNullValue(WeaponType.class)));
    }

    @Test
    public void readsInAPlayersChosenWeapon() throws Exception {
        BufferedReader br = mock(BufferedReader.class);
        when(br.readLine()).thenReturn("paper");

        Player player = new Player();
        player.chooseWeapon(br);

        verify(br, times(1)).readLine();
    }

    @Test
    public void letsPlayerInputAWeapon() throws IOException {
        BufferedReader br = mock(BufferedReader.class);
        when(br.readLine()).thenReturn("paper");

        Player player = new Player();
        player.chooseWeapon(br);

        assertThat(player.getWeaponType(), is(WeaponType.PAPER));
    }

    @Test
    public void throwsExceptionWithIOError() throws IOException {
        thrown.expect(IOException.class);
        thrown.expectMessage("IO error trying to read your weapon!");

        BufferedReader br = mock(BufferedReader.class);
        when(br.readLine()).thenThrow(IOException.class);

        Player player = new Player();
        player.chooseWeapon(br);
    }


    @Test
    public void throwsExceptionWhenInvalidWeaponIsEntered() throws EnumConstantNotPresentException, IOException {
        thrown.expect(EnumConstantNotPresentException.class);
        thrown.expectMessage("Invalid weapon choice!");

        BufferedReader br = mock(BufferedReader.class);
        when(br.readLine()).thenReturn("giraffe");

        Player player = new Player();
        player.chooseWeapon(br);
    }

}
