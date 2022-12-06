package al.academy.ikubinfo.bootcamp.seanca4.loops;

import java.util.Scanner;

public class ShembullDoWhile {

	private Scanner input = new Scanner(System.in);

	void printoNumratTekDeriNe(int deriNe) {
		int fillimi = 0;
		do {
			if (fillimi % 2 != 0) {
				System.out.println("Printo " + fillimi);
			}
			// fillimi++;
		} while (fillimi++ <= deriNe);
	}

	// printo shumen e numrave te dhene nga perdoruesi
	int ktheShumen() {
		int shuma = 0;
		do {
			System.out.println(
					"Ju lutem jepni nje numer dhe shtypni karakter shkronje ose simbol tjeter nese nuk deshironi te jepni me numra te tjere");

			int inputNumer = input.nextInt();
			shuma += inputNumer;
			System.out.println("Numri i dhene nga perdoruesi eshte " + inputNumer);
			System.out.println(
					"Ju lutem jepni nje numer dhe shtypni karakter shkronje ose simbol tjeter nese nuk deshironi te jepni me numra te tjere");
		} while (input.hasNextInt());

		System.out.println("Perfundoi procesi i leximit te numrave nga perdoruesi");

		return shuma;
	}

	public static void main(String[] args) {

		ShembullDoWhile shembullObj = new ShembullDoWhile();
		//shembullObj.printoNumratTekDeriNe(5);
		int shuma = shembullObj.ktheShumen();
		System.out.println("Shuma e numrave te dhene nga perdoruesi eshte " + shuma);
	}
}
