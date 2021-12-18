package vjezba3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Krug {
	
	int brKruga;
	
	public HashMap<Natjecatelj, vrstaJela> jela = new HashMap<Natjecatelj, vrstaJela>();
	
	public List<Ocjena> ocjenjivanje = new ArrayList<Ocjena>();
	
	enum vrstaJela{
		TP,
		HP,
		JUHA,
		GJ,
		DESERT
	}
	
	public Krug (int i) {
		this.brKruga = i;
	}
	
	public void kuhaj (Natjecatelj n, String jela) {
		vrstaJela temp = vrstaJela.valueOf(jela);
		
		this.jela.put(n, temp);
	}
	
	public void ocjeni(Sudac s, Natjecatelj n, int ocjena) {
		Ocjena o = new Ocjena(s, n, ocjena);
		ocjenjivanje.add(o);
	}
	
}
