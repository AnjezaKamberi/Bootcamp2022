package al.academy.ikubinfo.bootcamp;

import java.util.Scanner;

public class Main {

	private int getNumer() {

		int numer1 = 3;
		int numer2 = 10;

		if (numer1 < numer2) {
			System.out.println(
					"numri qe ndodhet ne variablin 'numer1 ' eshte me i vogel se numri qe ndodhet ne variablin 'numer2'");
			System.out.println("###");
			if (numer1 == 2) {
				System.out.println("vlera qe ndodhet te var1 eshte 2");
			} else if (numer2 == 10) {
				System.out.println("vlera qe ndodhet te var2 eshte 10");
			}
			return -1;

		} else if (numer1 > numer2) {
			
			System.out.println(
					"numri qe ndodhet ne variablin 'numer1 ' eshte me i madh se numri qe ndodhet ne variablin 'numer2'");
			if (numer1 == 2) {
				System.out.println("vlera qe ndodhet te var1 eshte 2");
			} else if (numer2 == 10) {
				System.out.println("vlera qe ndodhet te var2 eshte 10");
			}
			
			return 1;
		} else {
			System.out.println(
					"numri qe ndodhet ne variablin 'numer1 ' eshte i barabarte me numrim qe ndodhet ne variablin 'numer2'");
			if (numer1 == 2) {
				System.out.println("vlera qe ndodhet te var1 eshte 2");
			} else if (numer2 == 10) {
				System.out.println("vlera qe ndodhet te var2 eshte 10");
			}

		}
		System.out.println("shprehja 1 ");
		System.out.println("shprehja 2");
		return 0;
	}

	public static void main(String[] args) {
		//Main mainObject = new Main();
		//int numri = mainObject.getNumer();
		//System.out.println("numri qe eshte kthyer si rezultat i krahasimit eshte : " + numri);

	}
}
