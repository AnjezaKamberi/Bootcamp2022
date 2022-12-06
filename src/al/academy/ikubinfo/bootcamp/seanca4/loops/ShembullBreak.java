package al.academy.ikubinfo.bootcamp.seanca4.loops;

import java.util.Scanner;

public class ShembullBreak {

	static void listo() {
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				continue;
			}
			System.out.println("numri eshte " + i);

		}
	}

	public static void main(String[] args) {

		listo();
		/*
		 * int vlera, shuma = 1500; Scanner input = new Scanner(System.in);
		 * 
		 * while (true) {
		 * System.out.print("Jep vleren qe do te depozitosh ne llogarine tende: ");
		 * 
		 * vlera = input.nextInt();
		 * 
		 * if (vlera < 0) { break; }
		 * 
		 * shuma += vlera; }
		 * 
		 * System.out.println("Gjendja juaj bankare eshte : " + shuma);
		 */

	}
}
