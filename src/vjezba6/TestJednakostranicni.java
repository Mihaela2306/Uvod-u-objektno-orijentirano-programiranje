package vjezba6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJednakostranicni {

	@Test
	public void test() {
		Trokut t = new Trokut(3, 3, 3);
		assertEquals("Jednakostranicni trokut", t.vrstaTrokuta());
	}

}
