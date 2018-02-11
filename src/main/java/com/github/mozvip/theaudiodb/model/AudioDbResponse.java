package com.github.mozvip.theaudiodb.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AudioDbResponse {

	@JsonProperty(value = "album")
	private List<AudioDbAlbum> albums;

	@JsonProperty(value = "artists")
	private List<AudioDbArtist> artists;

	public List<AudioDbAlbum> getAlbums() {
		return albums;
	}

	public void setAlbum(List<AudioDbAlbum> albums) {
		this.albums = albums;
	}

	public AudioDbAlbum getSingleAlbum() {
		return albums.get(0);
	}

	public List<AudioDbArtist> getArtists() {
		return artists;
	}

	public void setArtists(List<AudioDbArtist> artists) {
		this.artists = artists;
	}

	public AudioDbArtist getSingleArtist() {
		return artists.get(0);
	}
}
