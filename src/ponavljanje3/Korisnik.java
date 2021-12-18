package ponavljanje3;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Korisnik {

	String ime;
	String adresa;
	Path dat;
	
	Korisnik(String ime, String dat){
		this.ime = ime;
		
		this.dat = Paths.get(dat);
	}
	
	public void unajmi(Vozilo a, Zaposlenik z) {
		StringBuilder sb = new StringBuilder(a.model + "," + a.cijena + "\n");
		try {
			Files.write(dat, sb.toString().getBytes(), StandardOpenOption.APPEND);
			z.iznajmi(a);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public double potroseno() {
		double potrosnja = 0;
		
		try {
			List<String> tekst = Files.readAllLines(dat);
			
			for (String line : tekst) {
				int i = line.indexOf(',');
				
				potrosnja += Double.parseDouble(line.substring(i + 1));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return potrosnja;
	}
	
}
