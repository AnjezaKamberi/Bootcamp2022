package al.academy.ikubinfo.bootcamp.seanca4.loops;

import java.util.Scanner;

public class ShembullContinue {

	public static void main(String[] args) {

		int shuma = 0;
		Scanner input = new Scanner(System.in);
		// midis 10 numrave te dhena si input nga perdoruesi gjej shumen vetem per ato
		// numra qe jane tek
		for (int fillimi = 1; fillimi < 10; fillimi++) {

			System.out.println("Ju lutem jepni numrin: ");
			int numri = input.nextInt();

			if (numri % 2 == 0) {
				continue;
			}

			shuma += numri;
		}

		System.out.println("shuma per numrat e dhene eshte " + shuma);
	}

}
