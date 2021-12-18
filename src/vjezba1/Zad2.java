package vjezba1;

import java.util.Scanner;
/**
 * 
 * @author Mihaela
 *
 */
public class Zad2 {
	
	/**
	 * 
	 * @param args Argumenti koje primamo u glavnoj metodi
	 */
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String ulaz = new String();
		ulaz = scn.nextLine();
		System.out.println("Originalni string: " + ulaz);
		System.out.println("Obrnuti string: " + obrni(ulaz));
		
		
		
		scn.close();

	}
	
	/**
	 * metoda koja jedan string vraca ispisan naopako
	 * 
	 * @param ulaz string koji zelim obrnuti
	 * @return string koji sam obrnula
	 */
	private static String obrni(String ulaz) {
		String novi = new String();
		
		for (int i = ulaz.length() - 1; i >= 0; i--) {
			novi = novi + ulaz.charAt(i);
		}
		
		return novi;
	}

}
