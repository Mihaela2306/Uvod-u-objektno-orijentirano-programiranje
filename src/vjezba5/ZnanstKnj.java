package vjezba5;

public class ZnanstKnj extends Knjiga implements IKupnja {
	
	int cijena;

	public ZnanstKnj(String ime, int brPr) {
		super(ime, brPr);
	}

	@Override
	public boolean kupi() {
		if (this.brPr > 1) {
			brPr--;
			return true;
		} else {
			System.out.println("Samo za citanje");
			return false;
		}
	}

	@Override
	public void setCijena(int cijena) {
		this.cijena = cijena;
	}

}
