package vjezba3;

public class Sudac {
	
	public String ime;
	private int ID;
	static int brSud;
	
	public Sudac (String ime) {
		this.ime = ime;
		brSud++;
		this.ID = brSud;
	}
	
	public int getID () {
		return this.ID;
	}
	
}
