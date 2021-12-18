package ponavljanje2.Zad2;

public class Igra {
	
	Igrac a, b;

	public Igra (Igrac a, Igrac b) {
		this.a = a;
		this.b = b;
	}
	
	public String igraj() {
		for (int i = 1; i < 11; i++) {
			a.rezultat += a.runda();
			b.rezultat += b.runda();
		}
		
		return "Igrac a= " + a.rezultat + "\nIgrac b= " + b.rezultat;
	}
	
}
