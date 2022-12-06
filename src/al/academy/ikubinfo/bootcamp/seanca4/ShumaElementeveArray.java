package al.academy.ikubinfo.bootcamp.seanca4;

import java.util.Scanner;

public class ShumaElementeveArray {

	static void getNumer(int numer) {
		System.out.println("numri para modifikimit esgte : " + numer);
		numer = numer *2;
		System.out.println("numri pas modifikimit eshte : " + numer);
	}
	
	
	static void dyfishoVleratArray(int[] numrat) {

		for (int i = 0; i < numrat.length; i++) {
			System.out.println("vlera perpara modifikimit " + numrat[i]);
			numrat[i] = numrat[i] * 2;
			System.out.println("vlera pas modifikimit " + numrat[i]);
		}

	}

	static void printoLlogaritShumen() {
		Scanner in = new Scanner(System.in);
		int[] numrat = new int[10];

		int shuma = 0;

		for (int i = 0; i < numrat.length; i++) {
			System.out.println("Jep nje numer: ");
			numrat[i] = in.nextInt();
			System.out.println(numrat[i]);
			shuma += numrat[i]; // shuma = shuma + numrat[i];
		}

		System.out.println("Shuma eshte: " + shuma);
	}

	public static void main(String[] args) {

		/*int[] numrat = new int[] { 4, 5, 7, 9 };

		dyfishoVleratArray(numrat);

		for (int i = 0; i < numrat.length; i++) {
			System.out.println("elementi ne indexin " + i + " ka vleren " + numrat[i]);
		}*/
		
		int numer = 10;
		
		getNumer(numer);
		
		System.out.println(numer);
	}

}
