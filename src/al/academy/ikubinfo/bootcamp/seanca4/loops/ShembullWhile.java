package al.academy.ikubinfo.bootcamp.seanca4.loops;

import java.util.Scanner;

public class ShembullWhile {

	private Scanner input = new Scanner(System.in);

	
	// TODO listo dhe llogarit shumen e numrave nga 1 deri ne 10
	public static void shuma () {
		int numer =1;
		int shuma =0;
		
		while (numer <11) {
			System.out.println("numri eshte :" + numer);
			shuma += numer; //shuma = shuma + numer
			numer ++;
			
		}
		System.out.println("shuma e numrave deri ne 10 eshte :" + shuma );
	}
	
	
	
	
	
	
	// TODO gjej sa numra jane me te medhenj se numri 5 ne inputet e dhena nga nje
	// perdorues

	/**
	 * listimi i numrave pozitive nga zero deri te numri i kaluar si parameter
	 * 
	 * @param deriNe - limiti i siperm i numrave pozitive
	 */
	void listoNumratPozitive(int deriNe) {

		if (deriNe < 0) {
			System.out.println("Numri i dhene si parameter eshte jo pozitiv!");
		} else if (deriNe == 0) {
			System.out.println("Numri i dhene si parameter eshte 0 - zero");
		} else {
			while (deriNe > 0) {
				System.out.println("Numri pozitiv : " + deriNe);
				deriNe--;
			}
			System.out.println("Perfundoi listimi i numrave pozitiv deri te numri i kaluar si parameter!");
		}
	}

	// lexo numrat nga perdoruesi dhe printo secilin prej tyre derisa perdoruesi te
	// jape nje vlere tekst
	void listoNumratInputNgaPerdoruesi() {
		System.out.println(
				"Ju lutem jepni nje numer dhe shtypni karakter shkronje ose simbol tjeter nese nuk deshironi te jepni me numra te tjere");

		while (input.hasNextInt()) {
			int inputNumer = input.nextInt();
			System.out.println("Numri i dhene nga perdoruesi eshte " + inputNumer);
			System.out.println(
					"Ju lutem jepni nje numer dhe shtypni karakter shkronje ose simbol tjeter nese nuk deshironi te jepni me numra te tjere");
		}

		System.out.println("Perfundoi procesi i leximit te numrave nga perdoruesi");
	}

	void listoNumrat(int numer) {

		while (numer > 0) {

			System.out.println("Numri ka vleren " + numer);

			numer--;
		}

		System.out.println("avvvvv");

	}

	public static void main(String[] args) {

		ShembullWhile shembullObj = new ShembullWhile();
		
		shuma();

		/*
		 * shembullObj.listoNumratPozitive(-5); System.out.println(" ----------- ");
		 * shembullObj.listoNumratPozitive(0); System.out.println(" ----------- ");
		 * shembullObj.listoNumratPozitive(5);
		 */
		//shembullObj.listoNumratInputNgaPerdoruesi();

		/*
		 * shembullObj.listoNumrat(5); System.out.println(" ----------- ");
		 * shembullObj.listoNumrat(2); System.out.println(" ----------- ");
		 * shembullObj.listoNumrat(4); System.out.println(" ----------- ");
		 * shembullObj.listoNumrat(-1);
		 */
	}
}
