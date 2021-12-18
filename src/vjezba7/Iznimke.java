package vjezba7;

public class Iznimke {

	public static void main(String[] args) {
		
		try {
			int[] a = {1};
			System.out.println(a[1]);
		}
		catch(NullPointerException e) {
			System.out.println("Polje ne postoji");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Izlazite iz granica polja");
		}
		catch (Exception e) {
			System.out.println("Desila se neka druga greska");
		}
		
	}

}
