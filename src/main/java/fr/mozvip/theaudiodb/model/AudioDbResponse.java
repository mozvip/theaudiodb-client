package fr.mozvip.theaudiodb.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AudioDbResponse {

	@JsonProperty(value = "album")
	private List<AudioDbAlbum> album;

	@JsonProperty(value = "artists")
	private List<AudioDbArtist> artists;

	public List<AudioDbAlbum> getAlbum() {
		return album;
	}

	public void setAlbum(List<AudioDbAlbum> album) {
		this.album = album;
	}

	public List<AudioDbArtist> getArtists() {
		return artists;
	}

	public void setArtists(List<AudioDbArtist> artists) {
		this.artists = artists;
	}

}
