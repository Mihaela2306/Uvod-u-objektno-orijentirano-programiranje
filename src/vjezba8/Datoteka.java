package vjezba8;

import java.io.*;

public class Datoteka {
	
	File ulaz, izlaz;

	public Datoteka (String u, String i) {
		ulaz = new File(u);
		izlaz = new File(i);
	}
	
	public void zapisi() throws IOException {
		izlaz.createNewFile();
		
		BufferedReader bufr = new BufferedReader(new FileReader(ulaz));
		BufferedWriter bw = new BufferedWriter(new FileWriter(izlaz));
		
		String line = new String();
		int i = 0;
		StringBuilder sb = new StringBuilder("/");
		
		while ((line = bufr.readLine()) != null) {
			i++;
			sb.append(i + "/" + line + "\n");
			bw.append(sb);
			sb.delete(1, sb.length());
		}
		
		bufr.close();
		bw.close();
	}
	
	public void ispis() throws IOException {
		BufferedReader bufr = new BufferedReader(new FileReader(izlaz));
		
		String line = new String();
		StringBuilder sb = new StringBuilder();
		
		while ((line = bufr.readLine()) != null) {
			sb.append(line);
		}
		
		bufr.close();
		System.out.println(sb.toString());
	}
	
}
