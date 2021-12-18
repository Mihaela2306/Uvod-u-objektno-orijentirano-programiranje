package vjezba9;

import java.util.Scanner;

public class Igra {
	
	Igrac a, b;
	int brR = 6;

	public Igra (Igrac a, Igrac b) {
		this.a = a;
		this.b = b;
	}

	public String start() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 1; i <= brR; i++) {
			while(bodovanje(a, a.roll(s), i));
			while(bodovanje(b, b.roll(s), i));
		}
		
		return "a = " + a.bodovi + " b = " + b.bodovi;
	}
	
	public boolean bodovanje(Igrac igr, int[] kockice, int brRunde) {
		if((kockice[0] == kockice[1]) && (kockice[1] == kockice[2])) {
			if(kockice[0] == brRunde) {
				igr.bodovi += 21;
				return true;
			} else {
				igr.bodovi += 5;
				return false;
			}
		} else {
			for (int i = 0; i < 3; i++) {
				if (kockice[i] == brRunde) {
					igr.bodovi++;
				}
			}
		}
		return false;
	}
	
}
