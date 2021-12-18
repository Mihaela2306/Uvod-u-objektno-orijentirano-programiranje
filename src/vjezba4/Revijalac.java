package vjezba4;

public class Revijalac extends Trkac {
	
	public Revijalac(String ime, double proVri) {
		super(ime, proVri);
		this.prijPut = 5;
		
		sveBrz += this.brzina();
	}

	public void dodjela() {
		if(this.brzina() > (Trkac.sveBrz/Trkac.brNat)) {
			this.nagrada = "Nagrada za sudjelovanje";
			System.out.println("Nagrada za sudjelovanje: " + this.getIme());
		}
	}
	
}
