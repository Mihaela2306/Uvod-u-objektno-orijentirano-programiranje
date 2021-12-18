package vjezba8;

import java.io.IOException;

public class PrimjerSB {

	public static void main(String[] args) {
		
		//string - immutable
		//String s = new String("Hello");
		//s += " World";	//stvara se novi objekt
		
		//StringBuilder | StringBuffer - za ceste manipulacije sa stringovima
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");	//ne stvaramo novi objekt
		System.out.println(sb);
		sb.insert(6, "Pretty ");
		System.out.println(sb);
		sb.delete(0, 6);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		Datoteka dat = new Datoteka("Dir//datoteka.txt", "Dir//izlaz.txt");
		try {
			dat.zapisi();
			//System.out.println(dat.ispis());
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
