package vjezba8;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestDatoteka {
	
	private final ByteArrayOutputStream izlaz = new ByteArrayOutputStream();
	
	@Before
	public void setIzlaz() {
		System.setOut(new PrintStream(izlaz));
	}
	
	@Rule
	public final ExpectedException exc = ExpectedException.none();

	@Test
	public void test1() throws IOException {
		Datoteka dat = new Datoteka("Dir//datoteka.txt", "Dir//izlaz.txt");
		exc.expect(IOException.class);
		dat.zapisi();
	}
	
	@Test
	public void upis() throws IOException {
		Datoteka dat = new Datoteka("Dir//datoteka.txt", "Dir//izlaz.txt");
		dat.zapisi();
		dat.ispis();
		assertEquals(izlaz.toString(), "/1/Imam puno za uciti"
				+ "/2/Imam puno za uciti"
				+ "/3/Lijep je dan\r\n");
	}

}
