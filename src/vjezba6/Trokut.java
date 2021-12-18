package vjezba6;

public class Trokut {

	double a, b, c;
	
	Trokut(double i, double j, double k){
		a = i;
		b = j;
		c = k;
	}
	
	public String vrstaTrokuta() {
		if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
			return "Nije trokut";
		} else if ((a != b) && (a != c) && (b != c)) {
			return "Raznostranicni trokut";
		} else if ((a == b) && (a == c) && (b == c)) {
			return "Jednakostranicni trokut";
		} else if ((a == b) || (a == c) || (b == c)) {
			return "Jednakokracni trokut";
		}
		
		return "";
	}
	
}
