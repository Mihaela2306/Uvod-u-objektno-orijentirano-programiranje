package vjezba5;

import java.util.ArrayList;
import java.util.List;

public class Citac {

	String ime;
	List<Knjiga> popis = new ArrayList<Knjiga>();
	
	
	public Citac(String ime) {
		this.ime = ime;
	}
	
	public void zelim(Knjiga k) {
		if (k instanceof ZnanstKnj) {
			if (((ZnanstKnj) k).kupi()) {
				System.out.println("Knjiga uspjesno kupljena");
			}
		} else {
			if (popis.size() == 3) {
				System.out.println("Posuden maksimalan broj knjiga");
				return;
			}
			if (((Belatristika) k).posudi()) {
				System.out.println("Knjiga posudena");
				popis.add(k);
			}
		}
	}
	
	public void vracanje(Knjiga k) {
		if (popis.contains(k)) {
			((Belatristika) k).vrati();
			popis.remove(k);
			System.out.println("Uspjesno vracena knjiga");
			return;
		}
		System.out.println("Neuspjesno vracena knjiga");
	}
	
}
