package ponavljanje3;

public class Motor extends Vozilo {
	
	double zapremnina;

	Motor(String model, double cijena, double zapremnina) {
		super(model, cijena);
		this.zapremnina = zapremnina;
	}
	
}
