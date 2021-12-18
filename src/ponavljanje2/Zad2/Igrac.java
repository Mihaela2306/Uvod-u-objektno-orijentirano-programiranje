package ponavljanje2.Zad2;

import java.util.Scanner;

public class Igrac {
	Scanner s = new Scanner(System.in);
	
	int rezultat = 0;
	
	public int runda() {
		int[] brCu = new int[2];
		brCu[0] = roll();
		
		if (brCu[0] > 10 || brCu[0] < 0) {
			throw new KrivoBacanje("Sruseno previse ili negativan broj bacanja!");
		}
		
		if (brCu[0] == 10) {
			return brCu[0] + roll() + roll();
		}
		
		brCu[1] = roll();
		
		if ((brCu[0] + brCu[1]) == 10) {
			return 10 + roll();
		}
		
		if ((brCu[0] + brCu[1]) > 10) {
			throw new KrivoBacanje("Zbroj cunjeva veci od 10!");
		}
		
		return brCu[0] + brCu[1];
	}
	 	 	 
	int roll() {	
		int x = s.nextInt();
		return x;
	}


}