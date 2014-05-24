package designPatterns;

public class MediaFactory implements IFactory {

	public IMediaFile createMedia(String type) {
		IMediaFile media = null;

		if ("MP3".equalsIgnoreCase(type)) {
			media = new MP3();
		} else if ("WAV".equalsIgnoreCase(type)) {
			media = new WAV();
		} else if ("OGG".equalsIgnoreCase(type)) {
			media = new OGG();
		} else if (media==null) {
			System.out.println("The type file is invalid (package: iis1314.designPatterm.factoryMethod.MediaFactory): Null");
		}
		return media;
	}
}
