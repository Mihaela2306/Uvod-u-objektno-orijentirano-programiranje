package ponavljanje3;

import java.util.ArrayList;

public abstract class Vozilo {

	String model;
	double cijena;
	public static ArrayList<Vozilo> popisVozila = new ArrayList<Vozilo>();
	
	Vozilo(String model, double cijena){
		this.model = model;
		this.cijena = cijena;
		popisVozila.add(this);
	}
	
	
	
}
