package vjezba2;

import java.util.ArrayList;
import java.util.List;

public class Kupac {

	final int kupacID;
	final String kupacIme;
	
	static int brKup = 0;
	
	private String kupacTel;
	private String kupacAdr;
	
	final int MAXART;
	List<Artikl> kosarica = new ArrayList<Artikl>();
	
	public Kupac(String kupacIme, int velKos) {
		this.kupacIme = kupacIme;
		brKup++;
		this.kupacID = brKup;
		MAXART = velKos;
		System.out.println("Trenutni broj kupaca u ducanu: " + brKup);
	}
	
	public boolean dodajArt(String imeArt, int artID) {
		if (kosarica.size() == MAXART) {
			System.out.println("Kosarica puna");
			return false;
		}
		Artikl a1 = new Artikl(imeArt, artID);
		kosarica.add(a1);
		return true;
	}
	
	void print(){
		String izlaz = kupacID + " " + kupacIme;
		
		for (Artikl a : kosarica) {
			izlaz = izlaz + " " + a.getArtiklIme();
		}
		
		System.out.println(izlaz);
	}

	public String getKupacTel() {
		return kupacTel;
	}

	public void setKupacTel(String kupacTel) {
		this.kupacTel = kupacTel;
	}

	public String getKupacAdr() {
		return kupacAdr;
	}

	public void setKupacAdr(String kupacAdr) {
		this.kupacAdr = kupacAdr;
	}
	
}
