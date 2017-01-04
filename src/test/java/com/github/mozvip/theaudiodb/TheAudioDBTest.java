package com.github.mozvip.theaudiodb;


import java.io.IOException;

import org.junit.Test;

import com.github.mozvip.theaudiodb.model.AudioDbResponse;

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
