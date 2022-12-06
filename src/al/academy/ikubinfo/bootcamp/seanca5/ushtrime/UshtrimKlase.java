package al.academy.ikubinfo.bootcamp.seanca5.ushtrime;

import java.util.*;

public class UshtrimKlase {

	public static void ndihmese() {
		int[] numra = new int[] { 2, 4, 6, 8, 10, 12 };
		Scanner in = new Scanner(System.in);
		System.out.print("Jep numer: ");
		int nr = in.nextInt();

		for (int i = 0; i < numra.length; i++) {
			int x = numra[i];
			for (int j = i + 1; j < numra.length; j++) {
				if (x + numra[j] == nr) {
					System.out.println("Indeksi i numrit te pare: " + i + " Indeksi i numrit te dyte: " + j);
					System.out.print(x + " + " + numra[j] + " = " + nr);
					return;
				}
			}
		}
	}

	
	public static void main(String[] args) {
		int[] numra = new int[] { 2, 4, 6, 8, 10, 12 };
		Scanner in = new Scanner(System.in);
		System.out.print("Jep numer: ");
		int nr = in.nextInt();

		for (int i = 0; i < numra.length; i++) {
			int x = numra[i];
			for (int j = i + 1; j < numra.length; j++) {
				if (x + numra[j] == nr) {
					System.out.println("Indeksi i numrit te pare: " + i + " Indeksi i numrit te dyte: " + j);
					System.out.print(x + " + " + numra[j] + " = " + nr);
					System.exit(0);
				}
			}
		}
		System.out.println("Nuk u gjet!");

	}

}
