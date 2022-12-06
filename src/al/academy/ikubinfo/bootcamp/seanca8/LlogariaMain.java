package al.academy.ikubinfo.bootcamp.seanca8;

import java.util.Scanner;

public class LlogariaMain {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("vendos vleren e balances"); int b = sc.nextInt();
		 * Llogaria l = new Llogaria(b); System.out.println("balanca eshte" +
		 * l.getBalanca());
		 * 
		 * System.out.println("balanca mbas depozitimit eshte :"+l.depozitoShume(-100));
		 * 
		 * System.out.println("balanca mbas terheqjes eshte :"+l.terhiqShume(100));
		 * 
		 * LlogariKursim Llogaria1 = new LlogariKursim(400.00); double a
		 * =Llogaria1.llogaritKursim(0.3);
		 * System.out.println("Shuma e re ne balanc eshte "+a);
		 * 
		 */
		LlogariCasti llogariaCasti = new LlogariCasti(200);
		double vleraMbetur = llogariaCasti.terhiqShume(500);
		System.out.println("Shuma e mbetur: " + vleraMbetur);

	}
}
