package ponavljanje2.Zad1;

import java.util.Scanner;

public class Matrica {

	int v1, v2;
	private int[][] m;
	
	public Matrica(int i, int j) {
		v1 = i;
		v2 = j;
		m = new int[i][j];
		
		Scanner s = new Scanner(System.in);
		
		for(int i1 = 0; i1 < i; i1++) {
			for(int j1 = 0; j1 < j; j1++) {
				m[i1][j1] = s.nextInt();
			}
		}
	}
	
	public Matrica(int[][] polje) {
		m = polje;
		v1 = polje.length;
		v2 = polje[0].length;
	}
	
	public boolean promijeni(int i, int j, int br) {
		if((i < 0) || (j < 0)) {
			return false;
		} else if ((i >= v1) || (j >= v2)) {
			return false;
		}
		
		m[i][j] = br;
		return true;
	}
	
	public void ispis() {
		for (int i = 0; i < v1; i++) { 
			for (int j = 0; j < v2; j++) { 
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int getEle(int i, int j) {
		if((i < 0) || (j < 0)) {
			System.out.println("Krivo dohvacanje elementa (i < velicine matrice)");
			return 0;
		} else if ((i >= v1) || (j >= v2)) {
			System.out.println("Krivo dohvacanje elementa (i > velicine matrice)");
			return 0;
		}
		
		return m[i][j];
	}
	
}
