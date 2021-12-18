package vjezba3;

public class Natjecatelj {
	
	public String ime;
	private int ID;
	static int brNat;
	
	public Natjecatelj(String ime) {
		this.ime = ime;
		brNat++;
		this.ID = brNat;
	}
	
	public int getID () {
		return this.ID;
	}
	
}
