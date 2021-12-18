package vjezba1;

public class Zad1 {

	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("Krivi poziv");
			return;
		} 
		
		int i = Integer.parseInt(args[0]);
		System.out.println(Integer.toBinaryString(i));

	}

}
