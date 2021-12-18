package ponavljanje3;

import java.util.ArrayList;

public class Zaposlenik {

	String ime;
	private double placa;
	ArrayList<Vozilo> vozila = new ArrayList<Vozilo>();
	
	Zaposlenik(String ime){
		this.ime = ime;
	}
	
	public void iznajmi(Vozilo v) {
		placa = 0;
		
		if (vozila.size() == 3) {
			vozila.set(0, vozila.get(1));
			vozila.set(1, vozila.get(2));
			vozila.set(2, v);
		} else {
			vozila.add(v);
		}
		
		for (int i = 0; i < vozila.size(); i++) {
			placa += vozila.get(i).cijena;
		}
		
		placa *= 25;
	}
	
	public double getPlaca() {
		return placa;
	}
	
}
