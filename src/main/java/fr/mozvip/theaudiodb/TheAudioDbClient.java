package fr.mozvip.theaudiodb;

import java.io.IOException;

import fr.mozvip.theaudiodb.model.AudioDbResponse;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class TheAudioDbClient {
	
	public static final class Builder {
		
		private String apiKey = "1";
		
		public Builder apiKey( String apiKey ) {
			this.apiKey = apiKey;
			return this;
		}
		
		public TheAudioDbClient build() {
			return new TheAudioDbClient( apiKey );
		}
		
	}
	
	public static Builder Builder() {
		return new Builder();
	}
	
	private String apiKey;
	private TheAudioDbService service = null;

	public TheAudioDbClient(String apiKey) {
		this.apiKey = apiKey;
		
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("http://www.theaudiodb.com")
				.addConverterFactory(JacksonConverterFactory.create())
				.build();
		service = retrofit.create(TheAudioDbService.class);		
	}

	public AudioDbResponse searchArtist(String artistName) throws IOException {
		return service.searchArtist(apiKey, artistName).execute().body();
	}

	public AudioDbResponse searchAlbum(String artistName, String albumName) throws IOException {
		return service.searchAlbum(apiKey, artistName, albumName).execute().body();
	}

	public AudioDbResponse searchAlbums(String artistName) throws IOException {
		return service.searchAlbums(apiKey, artistName).execute().body();
	}

	public AudioDbResponse getAlbum(long tadbAlbumId) throws IOException {
		return service.getAlbum(apiKey, tadbAlbumId).execute().body();
	}
	
	

}
