package ponavljanje2.Zad1;

public class Test {

	public static void main(String[] args) {
		
		Matrica m1 = new Matrica(2, 2);
		
		//System.out.println(m1.promijeni(0, 0, 0));
		//System.out.println(m1.promijeni(3, 2, 0));
		
		System.out.println("Matrica 1");
		m1.ispis();
		
		Matrica m2 = new Matrica(2, 2);
		System.out.println("Matrica 2");
		m2.ispis();
		
		Matrica m3 = Izracun.zbrajanje(m1, m2);
		System.out.println("Matrica 3");
		m3.ispis();

	}

}
