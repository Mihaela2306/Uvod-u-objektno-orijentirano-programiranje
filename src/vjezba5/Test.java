package vjezba5;

public class Test {

	public static void main(String[] args) {
		
		//ZnanstKnj z1 = new ZnanstKnj("Mat1", 3);
		//ZnanstKnj z2 = new ZnanstKnj("Fiz1", 2);
		
		Belatristika b1 = new Belatristika("b1", 3);
		//Belatristika b2 = new Belatristika("b2", 1);
		
		Citac c1 = new Citac("Marko Markic");
		System.out.println(b1.brPr);
		c1.zelim(b1);
		System.out.println(b1.brPr);
		c1.vracanje(b1);
		System.out.println(b1.brPr);

	}

}
