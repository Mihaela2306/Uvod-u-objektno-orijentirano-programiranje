package ponavljanje2.Zad2;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import java.util.InputMismatchException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;



public class KuglanjeTest {


	 @Rule
	public final ExpectedException exception = ExpectedException.none();
    public ByteArrayInputStream testIn;
    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }
    
    @Test
    public void testScoreNoSpareOrStrike() {
    	 provideInput("2\n3");
        Igrac a=new Igrac();
        assertEquals( 5,a.runda());
    }
    
    @Test
    public void test1() {
    	
    	   provideInput("10\n1\n2");	
    	   Igrac a=new Igrac();
        assertEquals(13,a.runda());   
        
    }
    @Test
    public void test2() {
    	   provideInput("5\n5\n8");
    	   Igrac game=new Igrac();
        assertEquals( 18,game.runda());          
    }
    @Test
    public void test3() {
    	 
    	   provideInput("10\n10\n10");	
    	    Igrac game=new Igrac();
        assertEquals( 30,game.runda());   
        
    }
    @Test
    public void testCijelaIgra1() {
    	  
    	   provideInput("1\n4"
    	   		+ "\n4\n5"
    	   		+ "\n6\n4\n5"
    	   		+ "\n5\n5\n1"
    	   		+ "\n7\n3\n6"
    	   		+ "\n4\n6\n2"
    	   		+ "\n8\n1\n"
    	   		+ "\n1\n1"
    	   		+ "\n3\n5"
    	   		+ "\n7\n2");	    
    	   Igrac a=new Igrac();
    	   provideInput("9\n1\n10"
    	   		+ "\n10\n10\n10"
    	   		+ " \n10\n10\n5 "
    	   		+ "\n4\n1  "
    	   		+ "\n9\n1\n5"
    	   		+ "\n4\n2"
    	   		+ "\n3\n3"
    	   		+ "\n6\n2"
    	   		+ "\n10\n1\n9"
    	   		+ "\n1\n1");	
    	   Igrac b=new Igrac();
    	   Igra game= new Igra(a,b);
        assertEquals("Igrac a= 96\nIgrac b= 137",game.igraj());          
    }
    @Test
    public void testCijelaIgra2() {
    	  
    	   provideInput("10\n5\n5\n"
    	   		+ "10\n3\n4\n"
    	   		+ "7\n2\n"
    	   		+ "8\n2\n10\n"
    	   		+ "10\n10\n10\n"
    	   		+ "10\n10\n2\n"
    	   		+ "10\n2\n3\n"
    	   		+ "2\n3\n"
    	   		+ "4\n6\n7\n"
    	   		+ "8\n2\n3");	    
    	   Igrac a=new Igrac();
    	   provideInput("0\n0\n"
       	   		+ "0\n0\n"
       	   		+ "0\n0\n"
       	   		+ "0\n0\n"
       	   		+ "0\n0\n"
       	   		+"0\n0\n"
       	   		+ "0\n0\n"
       	   		+ "0\n0\n"
       	   		+ "0\n0\n"
       	   		+ "0\n0\n");	
    	   Igrac b=new Igrac();
    	   Igra game= new Igra(a,b);
        assertEquals("Igrac a= 168\nIgrac b= 0",game.igraj());          
    }
    @Test
    public void testCijelaIgra3() {
    	  
    	   provideInput("10\n5\n5\n"
    	   		+ "10\n3\n4\n"
    	   		+ "7\n2\n"
    	   		+ "8\n2\n10\n"
    	   		+ "10\n10\n10\n"
    	   		+ "10\n10\n2\n"
    	   		+ "10\n2\n3\n"
    	   		+ "2\n3\n"
    	   		+ "4\n6\n7\n"
    	   		+ "8\n2\n3");	    
    	   Igrac a=new Igrac();
    	   provideInput("0\n0\n"
       	   		+ "0\n0\n"
       	   		+ "0\n0\n"
       	   		+ "0\n0\n"
       	   		+ "0\n0\n"
       	   		+"0\n0\n"
       	   		+ "0\n0\n"
       	   		+ "0\n0\n"
       	   		+ "5\n9\n"
       	   		+ "0\n0\n");	
    		exception.expect(KrivoBacanje.class);
    	   Igrac b=new Igrac();
    	   Igra game= new Igra(a,b);
        assertEquals("Igrac a= 168\nIgrac b= 0",game.igraj());          
    }
    @Test
    public void testCijelaIgraGreska1() {   	  
    	   provideInput("hello");	  
    	   exception.expect(InputMismatchException.class);
    	   Igrac a=new Igrac();
    	   Igrac b=new Igrac();
    	   Igra game= new Igra(a,b);
        assertEquals(0,game.igraj());          
    }
    @Test
    public void testCijelaIgraGreska2() {   	  
    	   provideInput("11");	  
    		exception.expect(KrivoBacanje.class);
    		 Igrac a=new Igrac();
      	   Igrac b=new Igrac();
      	   Igra game= new Igra(a,b);
        assertEquals(168,game.igraj());          
        
    }
    @Test
    public void testCijelaIgraGreska3() {   	  
    	   provideInput("-1");	  
    		exception.expect(KrivoBacanje.class);
    		 Igrac a=new Igrac();
      	   Igrac b=new Igrac();
      	   Igra game= new Igra(a,b);
        assertEquals(168,game.igraj());          
        
    }
}