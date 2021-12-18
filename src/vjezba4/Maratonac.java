package vjezba4;

public class Maratonac extends Trkac {

	static Maratonac najbrzi;
	
	public Maratonac(String ime, double proVri) {
		super(ime, proVri);
		this.prijPut = 42;
		
		if (najbrzi == null) {
			najbrzi = this;
		} else {
			if (this.brzina() > najbrzi.brzina()) {
				najbrzi = this;
			}
		}
		
		sveBrz += this.brzina();
	}

	public void dodjela() {
		if (this == najbrzi) {
			najbrzi.nagrada = "Zlato";
			System.out.println("Zlato ide: " + najbrzi.getIme());
		}
	}
	
}
