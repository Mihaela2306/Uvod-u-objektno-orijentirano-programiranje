package vjezba1;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("a = ");
		int a = scn.nextInt();
		System.out.println("b = ");
		int b = scn.nextInt();
		System.out.println("c = ");
		int c = scn.nextInt();

		double[] rje = rjesenje(a, b, c);
		
		System.out.println("x1 = " + rje[0] + "x2 = " + rje[1]);
		
		scn.close();
	}
	
	public static double[] rjesenje(int a, int b, int c) {
		double[] x = new double[2];
		
		x[0] = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
		x[1] = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
		
		return x;
	}

}
