package strategy;

public class Rar implements ICompressor {

	@Override
	public String compress(String data) {return ("Zar data: -"+data+"-");
	}

}
