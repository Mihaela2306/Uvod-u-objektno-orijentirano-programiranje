package vjezba3;

public class Test {

	public static void main(String[] args) {
		
		Natjecatelj n1 = new Natjecatelj("Natasa Maric");
		Natjecatelj n2 = new Natjecatelj("Slaven Bilic");
		
		Sudac s1 = new Sudac("Tomislav Spicek");
		Sudac s2 = new Sudac("Ivan Pazanin");
		Sudac s3 = new Sudac("Zeljka Klemencic");
		
		Krug k1 = new Krug(1);
		
		k1.kuhaj(n1, "GJ");
		k1.kuhaj(n2, "JUHA");
		
		System.out.println(k1.jela.get(n2));

	}

}
