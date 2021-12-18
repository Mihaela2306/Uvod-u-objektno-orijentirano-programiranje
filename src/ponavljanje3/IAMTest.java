package ponavljanje3;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

public class IAMTest {
	@Before
	public void reset() {
		Path dat= Paths.get("Kor1.txt");
		try {
			
			Files.delete(dat);
			Files.createFile(dat);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void AutoTest() {
		Vozilo a = new Auto("Kia Sportage", 1000, 5);
		assertEquals(a.cijena,1000,00.1);
	}
	/*@Test
	public void MotorTest() {
		Vozilo a = new Motor("Motor 1", 100, 234);
		assertEquals(Vozilo.popisVozila.size(),2);
	}*/
	@Test
	public void Zaposlenik1Test() {
		Zaposlenik z = new Zaposlenik("Zap 1");
		assertEquals(z.getPlaca(),0,0.0);
		
	}
	@Test
	public void Korisnik1Test() {
		Vozilo a = new Motor("Motor 1", 100, 234);
		Zaposlenik z = new Zaposlenik("Zap 1");
		Korisnik k1 = new Korisnik("Kor 1", "Kor1.txt");
		k1.unajmi(a, z);
		assertEquals(z.getPlaca(),2500,0.0);
	}
	@Test
	public void Korisnik2Test() {
		Vozilo a = new Motor("Motor 1", 100, 234);
		Auto b = new Auto("Kia Stonic", 200, 5);
		Auto c = new Auto("Hyundai i30", 190, 5);
		Zaposlenik z = new Zaposlenik("Zap 1");
		Korisnik k1 = new Korisnik("Kor 1", "Kor1.txt");
		k1.unajmi(a, z);
		k1.unajmi(b, z);
		k1.unajmi(c, z);
		assertEquals(z.getPlaca(),12250,0.0);
		assertEquals(k1.potroseno(),490,0.0);
	}
	@Test
	public void Korisnik3Test() {
		Vozilo a = new Motor("Motor 1", 100, 234);
		Auto b = new Auto("Kia Stonic", 200, 5);
		Auto c = new Auto("Hyundai i30", 190, 5);
		Auto d = new Auto("znjmnj i30", 190, 5);
		Zaposlenik z = new Zaposlenik("Zap 1");
		Korisnik k1 = new Korisnik("Kor 1", "Kor1.txt");
		k1.unajmi(a, z);
		k1.unajmi(b, z);
		k1.unajmi(c, z);
		k1.unajmi(d, z);
		assertEquals(z.getPlaca(),14500,0.0);
		assertEquals(k1.potroseno(),680,0.0);
	}
}
