package Test_Factory;

import static org.junit.Assert.*;

import javax.print.attribute.standard.MediaTray;

import org.junit.Test;

import designPatterns.IFactory;
import designPatterns.IMediaFile;
import designPatterns.MediaFactory;

public class Test_Factory {
	IMediaFile imf;
	IFactory IF;
	MediaFactory mf=new MediaFactory();

	@Test
	public void CrearMediaFactoryTest() {

		assertNotNull(mf);
	}

	@Test
	public void CrearMP3Test() {
		imf = mf.createMedia("MP3");
		String sonido = "Play MP3";
		assertEquals(sonido, imf.play());
	}

	@Test
	public void CrearWavTest() {
		imf = mf.createMedia("WAV");
		String sonido = "Playing WAV";
		assertEquals(sonido, imf.play());
	}

	@Test
	public void CrearOggTest() {
		imf = mf.createMedia("OGG");
		String sonido = "Playing Ogg";
		assertEquals(sonido, imf.play());
	}

	@Test(expected = RuntimeException.class)
	public void AudioDesconocidoTest() {
		imf = mf.createMedia("mp4");
		fail("audio desconocido");
	}

}