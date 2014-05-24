package designPatterns;

public class MediaFactory implements IFactory {
	public IMediaFile createMedia(String type) {
		if ("MP3".equalsIgnoreCase(type)) return new MP3();
		if ("WAV".equalsIgnoreCase(type)) return new WAV();
		if("OGG".equalsIgnoreCase(type)) return new OGG();
		throw new RuntimeException("The type file is invalid (package: iis1314.designPatterm.factoryMethod.MediaFactory): null");
	}
}
