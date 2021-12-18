package vjezba7;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Datoteke {

	public static void main(String[] args) {
		
		//putanja do datoteke ili direktorija
		Path p = Paths.get("Dir");
		
		try {
			if(!Files.exists(p)) {
				Files.createDirectories(p);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Stvaranje datoteke
		Path doc = Paths.get("Dir/datoteka.txt");
		
		try {
			if (!Files.exists(doc)) {
				Files.createFile(doc);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Citanje datoteke
		try {
			List<String> tekst = Files.readAllLines(doc);
			
			for (String line : tekst) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Pisanje u datoteku s brisanjem sadrzaja
		String zapis = "Imam puno za uciti";
		
		try {
			Files.write(doc, zapis.getBytes());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		//Dodavanje na kraj
		try {
			List<String> niz = Files.readAllLines(doc);
			Files.write(doc, niz, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
