package vjezba6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNiven {

	@Test
	public void test1() {
		assertTrue(Niven.jeliNiven(18));
	}
	
	@Test
	public void test2() {
		assertFalse(Niven.jeliNiven(13));
	}
	
	@Test
	public void test3() {
		assertTrue(Niven.jeliNiven(111));
	}
	
	@Test
	public void test4() {
		assertFalse(Niven.jeliNiven(121));
	}
	
	@Test
	public void test5() {
		assertTrue(Niven.jeliNiven(3));
	}

}
