package vjezba2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestKupac {
	
	Kupac k1;

	@Before
	public void set() {
		Kupac.brKup = 0;
		Kupac k1 = new Kupac("Slavko Slavic", 3);
		k1.setKupacAdr("Trsatske stube 4");
		k1.setKupacTel("92389237927");
	}
	
	@Test
	public void testBrKupaca1() {
		assertEquals(1, Kupac.brKup);
	}
	
	@Test
	public void testBrKupaca2() {
		Kupac k2 = new Kupac("Slavko Slavic", 3);
		k2.setKupacAdr("Trsatske stube 4");
		k2.setKupacTel("92389237927");
		assertEquals(2, Kupac.brKup);
	}

}
