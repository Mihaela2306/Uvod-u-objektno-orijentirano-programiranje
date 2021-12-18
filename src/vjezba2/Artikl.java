package vjezba2;

public class Artikl {
	
	private int artiklID;
	private String artiklIme;
	
	public Artikl(String artiklIme, int artiklID) {
		this.artiklID = artiklID;
		this.artiklIme = artiklIme;
	}
	
	public int getArtiklID() {
		return artiklID;
	}
	
	public String getArtiklIme() {
		return artiklIme;
	}
	
}
