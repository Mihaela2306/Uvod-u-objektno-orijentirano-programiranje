package vjezba6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJednakokracni {

	@Test
	public void test() {
		Trokut t = new Trokut(3, 3, 5);
		assertEquals("Jednakokracni trokut", t.vrstaTrokuta());
	}

}
