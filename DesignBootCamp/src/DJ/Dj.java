package DJ;

import java.util.HashMap;
import java.util.Map;

public class Dj {

	private boolean isPlaying;
	private String nextSong;
	private Map<String,String> songForLocation = new HashMap<>();
	public Dj()
	{
		songForLocation.put("Baner", "Hello");
		songForLocation.put("Wakad", "World");
	}
	public String changeOfLocationTo(String location) {
		String song = songForLocation.get(location);
		if (isPlaying) {
		nextSong = song;
		return currentSongCompleted();
		}
		return playSong(song);
		}
	public String currentSongCompleted()
	{
		isPlaying = false;
		return playSong(nextSong);
	}
	
	public String playSong(String song) {
		isPlaying = true;
		return songForLocation.get(song);
	}
	
	
}
