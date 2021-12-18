package vjezba4;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Trkac> natjecatelji = new ArrayList<Trkac>();
		
		natjecatelji.add(new Maratonac("Slavko Slavic", 271.3));
		natjecatelji.add(new Maratonac("Vesna Vesnic", 191.3));
		natjecatelji.add(new Maratonac("Romana Roamcs", 270.3));
		
		natjecatelji.add(new Revijalac("Marko Markic", 89.4));
		natjecatelji.add(new Revijalac("Miroslav Mirko", 30.1));
		
		Maratonac.najbrzi.dodjela();
		
		for (Trkac t : natjecatelji) {
			if (t instanceof Revijalac) {
				t.dodjela();
			}
		}
		
	}

}
