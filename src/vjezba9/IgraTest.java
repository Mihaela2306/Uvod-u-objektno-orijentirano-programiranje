package vjezba9;

import static org.junit.Assert.*;

import java.io.*;
import java.util.InputMismatchException;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class IgraTest {
   public final InputStream systemIn = System.in;
   public final PrintStream systemOut = System.out;

   public ByteArrayInputStream testIn;
   public ByteArrayOutputStream testOut;
    @Rule
	public final ExpectedException exception = ExpectedException.none();
    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }
    
	@Test
	public void test1() {
		Igrac a= new Igrac();
		Igrac b= new Igrac();     
		Igra igr=new Igra(a,b);
		provideInput("1\n2\n1"
				+ "\n3\n3\n3"
				+ "\n2\n3\n1"
				+ "\n2\n2\n2"
				+ "\n6\n6\n3"
				+ "\n2\n2\n4"
				+ "\n6\n5\n4"
				+ "\n4\n4\n4"
				+ "\n4\n4\n4"
				+ "\n6\n1\n2"
				+ "\n4\n4\n4"
				+ "\n1\n4\n4"
				+ "\n1\n1\n1"
				+ "\n5\n5\n1"
				+ "\n6\n6\n3"
				+ "\n6\n1\n2");	
		
		assertEquals("a = 52 b = 52",igr.start());		
	}
	@Test
	public void test2() {
		Igrac a= new Igrac();
		Igrac b= new Igrac();
		provideInput("1\n1\n1"
				+ "\n1\n1\n1"
				+ "\n1\n1\n1"
				+ "\n5\n5\n5"
				+ "\n3\n2\n1"
				+ "\n1\n1\n1"
				+ "\n1\n1\n1"
				+ "\n1\n1\n1"
				+ "\n1\n1\n1"
				+ "\n2\n3\n4"
				+ "\n5\n6\n6"
				+ "\n1\n2\n3"
				+ "\n1\n2\n3"
				+ "\n1\n2\n3"
				+ "\n1\n2\n3");	
		Igra igr=new Igra(a,b);
			
		assertEquals("a = 79 b = 11",igr.start());		
	}
	@Test
	public void test3() {
		Igrac a= new Igrac();
		Igrac b= new Igrac();
		provideInput("2\n2\n2"
				+ "\n1\n1\n1"
				+ "\n1\n1\n1"
				+ "\n5\n5\n5"
				+ "\n3\n2\n1"
				+ "\n1\n1\n1"
				+ "\n1\n1\n1"
				+ "\n1\n1\n1"
				+ "\n1\n1\n1"
				+ "\n2\n3\n4"
				+ "\n5\n6\n6"
				+ "\n1\n2\n3"
				+ "\n1\n2\n3"
				+ "\n1\n2\n3"
				+ "\n1\n2\n3");	
		Igra igr=new Igra(a,b);
		
		assertEquals("a = 17 b = 58",igr.start());		
	}
	@Test
	public void test4() {
		Igrac a= new Igrac();
		Igrac b= new Igrac();
		provideInput("1\n2\n3"
				+ "\n1\n2\n2"
				+ "\n6\n1\n2"
				+ "\n2\n2\n5"
				+ "\n3\n2\n1"
				+ "\n1\n4\n1"
				+ "\n4\n1\n1"
				+ "\n4\n3\n4"
				+ "\n2\n1\n1"
				+ "\n2\n3\n4"
				+ "\n5\n6\n6"
				+ "\n1\n2\n3"
				);	
		Igra igr=new Igra(a,b);
			
		assertEquals("a = 6 b = 5",igr.start());		
	}
	@Test
	public void test5() {
		Igrac a= new Igrac();
		Igrac b= new Igrac();
		provideInput("a b c");		
		Igra igr=new Igra(a,b);
		
		exception.expect(InputMismatchException.class);
		igr.start();		
	}
	
	
	@Test
	public void test6() {
		Igrac a= new Igrac();
		Igrac b= new Igrac();
		provideInput("1\n2\n1\n3\n3\n7");	
		Igra igr=new Igra(a,b);
		
		exception.expect(KrivoBacanje.class);
		igr.start();
			
	}
}