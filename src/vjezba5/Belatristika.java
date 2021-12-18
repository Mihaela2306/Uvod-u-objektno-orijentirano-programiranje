package vjezba5;

public class Belatristika extends Knjiga implements IPosudba {

	public Belatristika(String ime, int brPr) {
		super(ime, brPr);
	}

	@Override
	public boolean posudi() {
		if (this.brPr > 0) {
			this.brPr--;
			return true;
		}
		System.out.println("Nema dostupnih primjeraka");
		return false;
	}

	@Override
	public boolean vrati() {
		this.brPr++;
		return true;
	}

}
