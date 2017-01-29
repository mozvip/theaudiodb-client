package com.github.mozvip.theaudiodb;


import java.io.IOException;
import java.util.Optional;

import org.junit.Test;

import com.github.mozvip.theaudiodb.model.AudioDbResponse;

public class TheAudioDBTest {
	
	TheAudioDbClient client = TheAudioDbClient.Builder().build();

	@Test
	public void testSearchAlbum() throws IOException {
		Optional<AudioDbResponse> response = client.searchAlbum("Sia", "1000 Forms of Fear");
		assert(response.isPresent());
	}

	@Test
	public void testSearchAlbums() throws IOException {
		AudioDbResponse response = client.searchAlbums("Sia");
		assert(response.getAlbum().size() > 1);
	}

}
