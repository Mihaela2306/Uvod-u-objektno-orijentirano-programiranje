package ponavljanje2.Zad1;

public class Izracun {

	public static Matrica zbrajanje(Matrica a, Matrica b) {
		if ((a.v1 != b.v1) || (a.v2 != b.v2)) {
			System.out.println("Matrice moraju biti istih dimenzija");
			return null;
		}
		
		int[][] zbroj = new int[a.v1][a.v2];
		
		for (int i = 0; i < a.v1; i++) {
			for (int j = 0; j < a.v2; j++) {
				zbroj[i][j] = a.getEle(i, j) + b.getEle(i, j);
			}
		}
		
		return new Matrica(zbroj);
	}
	
}
