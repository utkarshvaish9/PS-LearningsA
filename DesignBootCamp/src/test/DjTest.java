package test;

import static org.junit.Assert.*;

import org.junit.Test;

import DJ.Dj;

public class DjTest {

	Dj dj  = new Dj();
	@Test
	public void songPlayForCurrentLocation() {
		String songPlaying = dj.playSong("Baner");
		assertEquals("Hello",songPlaying);
	}
	@Test
	public void songOnChangeOfLocation()
	{
		String songPlaying = dj.playSong("Baner");
		assertEquals("Hello",songPlaying);
		String songPlaying2 = dj.playSong("Wakad");
		assertEquals("abc",songPlaying2);
		
	}
	

	

}
