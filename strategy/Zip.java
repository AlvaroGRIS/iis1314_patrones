package strategy;

public class Zip implements ICompressor {

	@Override
	public String compress(String data) {return ("Zip data: -"+data+"-");}

}
