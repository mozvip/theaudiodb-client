

import java.io.IOException;

import org.junit.Test;

import fr.mozvip.theaudiodb.TheAudioDbClient;
import fr.mozvip.theaudiodb.model.AudioDbResponse;

public class TheAudioDBTest {
	
	TheAudioDbClient client = TheAudioDbClient.Builder().build();

	@Test
	public void testSearchAlbum() throws IOException {
		AudioDbResponse response = client.searchAlbum("Sia", "1000 Forms of Fear");
		assert(response.getAlbum().size() == 1);
	}

	@Test
	public void testSearchAlbums() throws IOException {
		AudioDbResponse response = client.searchAlbums("Sia");
		assert(response.getAlbum().size() > 1);
	}

}
