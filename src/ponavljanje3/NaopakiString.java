package ponavljanje3;

import java.util.ArrayList;
//import java.util.Arrays;

public class NaopakiString {

	String org;
	
	public NaopakiString(String s){
		this.org = s;
	}
	
	public String okreni() {
		ArrayList<String> rijeci = new ArrayList<String>();
		
		//rijeci = (ArrayList<String>) Arrays.asList(org.split(" "));
		
		int j = 0;
		
		for (int i = 0; i < org.length(); i++) {
			if (org.charAt(i) == ' ') {
				rijeci.add(org.substring(j, i));
				j = i + 1;
			}
		}
		
		rijeci.add(org.substring(j));
		
		for (int i = 0; i < rijeci.size(); i++) {
			if (i % 2 == 1) {
				StringBuilder s = new StringBuilder(rijeci.get(i));
				s.reverse();
				rijeci.set(i, s.toString());
			}
		}
		
		String rez = rijeci.toString().replace(",", "");
		
		return rez.substring(1, rez.length() - 1);
	}
	
}
