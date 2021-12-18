package vjezba6;

public class Niven {

	public static boolean jeliNiven(int i) {
		int broj = i;
		int x, sum = 0;
		
		while (broj > 0) {
			x = broj % 10;
			sum += x;
			broj /= 10;
		}
		
		if (i % sum == 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
