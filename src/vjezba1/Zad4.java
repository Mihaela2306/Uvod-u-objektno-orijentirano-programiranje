package vjezba1;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String line1 = scn.nextLine();
		String line2 = scn.nextLine();
		
		line1 = line1.replace(" ", "");
		line2 = line2.replace(" ", "");
		
		line1 = line1.toLowerCase();
		line2 = line2.toLowerCase();
		
		System.out.println(line1.equals(line2));
		
		scn.close();
	}
	
}
