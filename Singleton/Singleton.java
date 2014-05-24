public class Singleton {
	private static Singleton instancia;
	private int ID;

	private Singleton() {
		ID = 0;
	}

	public static Singleton getInstance() {
		if (instancia == null)
			instancia = new Singleton();
		return instancia;
	}
	
	public int getIdentifier(){
		ID++;
		return(ID-1);
	}

}
