package fr.mozvip.theaudiodb;

import fr.mozvip.theaudiodb.model.AudioDbResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TheAudioDbService {

	@GET("/api/v1/json/{apiKey}/search.php")
	Call<AudioDbResponse> searchArtist(@Path("apiKey") String apiKey, @Query("s") String artistName );

	@GET("/api/v1/json/{apiKey}/searchalbum.php")
	Call<AudioDbResponse> searchAlbum(@Path("apiKey") String apiKey, @Query("s") String artistName, @Query("a") String albumName);

	@GET("/api/v1/json/{apiKey}/searchalbum.php")
	Call<AudioDbResponse> searchAlbums(@Path("apiKey") String apiKey, @Query("s") String artistName);

	@GET("/api/v1/json/{apiKey}/album.php")
	Call<AudioDbResponse> getAlbum(@Path("apiKey") String apiKey, @Query("m") long tadbAlbumId);

}
