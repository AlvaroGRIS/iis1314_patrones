package Test_Strategy;

import static org.junit.Assert.*;

import org.junit.Test;

import strategy.*;


public class Test_Strategy {
	Context cont;
	String data = "string to compress";
	Rar rar = new Rar();
	SevenZip zip7 = new SevenZip();
	Zip zip = new Zip();

	@Test
	public void CrearClaseRarTest() {

		assertNotNull(rar);
	}

	@Test
	public void CrearClaseZipTest() {

		assertNotNull(zip);
	}

	@Test
	public void CrearClase7zipTest() {

		assertNotNull(zip7);
	}

	@Test
	public void CrearRarTest() {
	     cont = new Context(rar);
		String compressed = "Rar data: -"+data+"-";
		assertEquals(compressed, cont.compress(data));
	}

	@Test
	public void CrearZipTest() {
		cont = new Context(zip);
		String compressed = "Zip data: -"+data+"-";
		assertEquals(compressed, cont.compress(data));
	}

	@Test
	public void Crear7zipTest() {
		cont = new Context(zip7);
		String compressed = "7Zip data: -"+data+"-";
		assertEquals(compressed, cont.compress(data));
	}

}