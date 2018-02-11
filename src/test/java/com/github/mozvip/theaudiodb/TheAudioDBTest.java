package com.github.mozvip.theaudiodb;


import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.github.mozvip.theaudiodb.model.AudioDbAlbum;
import com.github.mozvip.theaudiodb.model.AudioDbArtist;
import org.junit.Test;

import com.github.mozvip.theaudiodb.model.AudioDbResponse;

public class TheAudioDBTest {
	
	TheAudioDbClient client = TheAudioDbClient.Builder().build();

	@Test
	public void testSearchAlbum() throws IOException {
		Optional<AudioDbResponse> response = client.searchAlbum("Sia", "1000 Forms of Fear");
		assert(response.isPresent());
		AudioDbAlbum singleAlbum = response.get().getSingleAlbum();
		assert(singleAlbum.getStrAlbum().equals("1000 Forms of Fear"));
	}

	@Test
	public void testSearchAlbums() throws IOException {
		AudioDbResponse response = client.searchAlbums("Sia");
		assert(response.getAlbums().size() > 1);
	}

	@Test
	public void testGetAlbum() throws IOException {
		AudioDbResponse response = client.getAlbum(2117293);
		AudioDbAlbum singleAlbum = response.getSingleAlbum();
		assert(singleAlbum.getStrAlbum().equals("True Blue"));
	}

	@Test
	public void testSearchArtistSia() throws IOException {
		Optional<AudioDbResponse> response = client.searchArtist("Sia");
		assert(response.isPresent());
		AudioDbArtist singleArtist = response.get().getSingleArtist();
		assert(singleArtist.getStrArtist().equals("Sia"));
	}

	@Test
	public void testSearchArtistMadonna() throws IOException {
		Optional<AudioDbResponse> response = client.searchArtist("Madonna");
		assert(response.isPresent());
		AudioDbArtist singleArtist = response.get().getSingleArtist();
		assert(singleArtist.getStrArtist().equals("Madonna"));
	}

	@Test
	public void testSearchArtistTheKillers() throws IOException {
		Optional<AudioDbResponse> response = client.searchArtist("The Killers");
		assert(response.isPresent());
		AudioDbArtist singleArtist = response.get().getSingleArtist();
		assert(singleArtist.getStrArtist().equals("The Killers"));
	}

}
