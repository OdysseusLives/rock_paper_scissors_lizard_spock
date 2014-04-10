import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class PlayerTest {
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
    public void readWeaponChoice_ReadsInAPlayersChosenWeapon() throws IOException {
        BufferedReader br = mock(BufferedReader.class);
        when(br.readLine()).thenReturn("paper");
        new Player().readWeaponChoice(br);
        verify(br, times(1)).readLine();
    }

    @Test
    public void readWeaponChoice_letsPlayerInputAWeapon() throws IOException {
        BufferedReader br = mock(BufferedReader.class);
        when(br.readLine()).thenReturn("paper");

        Player player = new Player();

        assertThat(player.readWeaponChoice(br), is("paper"));
    }

    @Test
    public void returnWeaponChoice_letsPlayerChooseAWeapon() throws IOException {
        BufferedReader br = mock(BufferedReader.class);
        when(br.readLine()).thenReturn("paper");

        Player player = new Player();
        assertThat(player.returnWeaponChoice(br), is(Weapon.PAPER));
    }

}
