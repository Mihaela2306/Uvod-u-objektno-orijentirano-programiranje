package vjezba4;

public class Trkac {

	private String ime;
	double prijPut;
	private double proVri;
	String nagrada;
	static int brNat;
	static double sveBrz;
	
	public String getIme() {
		return ime;
	}

	public double getProVri() {
		return proVri;
	}
	
	public Trkac(String ime, double proVri) {
		this.ime = ime;
		this.proVri = proVri;
		brNat++;
	}
	
	public double brzina() {
		return prijPut / proVri;
	}
	
	public void dodjela() {};

}
