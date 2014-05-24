package strategy;

public class SevenZip implements ICompressor {

	@Override
	public String compress(String data) {return ("7Zip data: -"+data+"-");}

}
