package vjezba6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRaznostranicni {

	@Test
	public void test() {
		Trokut t = new Trokut(6, 10, 15);
		assertEquals("Raznostranicni trokut", t.vrstaTrokuta());
	}

}
