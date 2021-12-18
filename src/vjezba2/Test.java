package vjezba2;

public class Test {

	public static void main(String[] args) {
		
		Kupac k1 = new Kupac("Slavko Slavic", 3);
		
		k1.print();
		
		k1.setKupacAdr("Trsatske stube 4");
		k1.setKupacTel("92389237927");
		
		Kupac k2 = new Kupac("Maja Markovic", 4);
		
		k2.setKupacAdr("Trsatske stube 2");
		k2.setKupacTel("445354");
		
		k2.print();
		
		k1.dodajArt("Mlijeko", 1);
		k1.dodajArt("Kruh", 1);
		k1.dodajArt("Voda", 1);
		k1.dodajArt("Cokolada", 1);
		
		k1.print();
	
	}

}
