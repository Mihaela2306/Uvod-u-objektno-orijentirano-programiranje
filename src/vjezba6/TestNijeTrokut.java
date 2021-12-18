package vjezba6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNijeTrokut {

	@Test
	public void test() {
		Trokut t = new Trokut(4, 1, 1);
		assertEquals("Nije trokut", t.vrstaTrokuta());
	}

}
