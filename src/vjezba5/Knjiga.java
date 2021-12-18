package vjezba5;

public abstract class Knjiga {
	
	String ime;
	int brPr;
	
	public Knjiga(String ime, int brPr) {
		this.ime = ime;
		this.brPr = brPr;
	}
	
	public void narucit(int i) {
		this.brPr += 1;
	}
	
}
