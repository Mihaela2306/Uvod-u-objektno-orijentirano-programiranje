package ponavljanje3;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void test1() {
		NaopakiString s1 = new NaopakiString("Subota je najbolji dan u tjednu");
		assertEquals(s1.okreni(), "Subota ej najbolji nad u undejt");
	}
	
	@Test
	public void test2() {
		NaopakiString s1 = new NaopakiString("Subota");
		assertEquals(s1.okreni(), "Subota");
	}
	
	@Test
	public void test3() {
		NaopakiString s1 = new NaopakiString("");
		assertEquals(s1.okreni(), "");
	}
	
	@Test
	public void test4() {
		NaopakiString s1 = new NaopakiString("a b c d e");
		assertEquals(s1.okreni(), "a b c d e");
	}
	
	@Test
	public void test5() {
		NaopakiString s1 = new NaopakiString("Subota je najbolji dan u tjednu wo");
		assertEquals(s1.okreni(), "Subota ej najbolji nad u undejt wo");
	}

}
