package vjezba7;

import java.nio.file.*;
import java.util.List;

public class Primjer1 {

	public static void main(String[] args) {
		
		Path ulaz = Paths.get("Dir/ulaz.txt");
		Path izlaz = Paths.get("Dir/izlaz.txt");
		
		if(!Files.exists(ulaz)) {
			return;
		}
		
		try {
			if(!Files.exists(izlaz)) {
				Files.createFile(izlaz);
			}
			
			List<String> tekst = Files.readAllLines(ulaz);
			int i = 0;
			
			for (String line : tekst) {
				i++;
				StringBuilder sb = new StringBuilder("/" + i + "/" + line + "\n");
				Files.write(izlaz, sb.toString().getBytes(), StandardOpenOption.APPEND);
				//Files.write(izlaz, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
			}
		}
		catch (Exception e) {
			System.out.println("Greska");
			e.printStackTrace();
		}

	}

}
