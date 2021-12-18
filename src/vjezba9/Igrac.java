package vjezba9;

import java.util.Scanner;

public class Igrac {

	int bodovi;
	
	int[] roll(Scanner s) {
		int[] polje = new int[3];
		
		polje[0] = s.nextInt();
		polje[1] = s.nextInt();
		polje[2] = s.nextInt();
		
		for (int i = 0; i < 3; i++) {
			if (polje[i] < 1 || polje[i] > 6) {
				throw new KrivoBacanje("Neispravne kockice");
			}
		}
		
		return polje;
	}
	
}
