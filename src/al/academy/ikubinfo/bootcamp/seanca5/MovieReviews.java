package al.academy.ikubinfo.bootcamp.seanca5;

import java.util.Scanner;

public class MovieReviews {

	// Nje matrice ruan reviewt qe jane bere per 5 filma te ndryshem nga 10
	// profesioniste. Printo reviewt per secilin film. / Ruaj ne nje array reviewt
	// totale per cdo film/filmi me me shume reviewt
	public static void main(String[] args) {

		int filmat = 5;
		int regjizoret = 10;
		int nota = 0;
		int[][] reviewt = new int[filmat][regjizoret];
		int[] vleresimiTotalFilm = new int[5];

		Scanner input = new Scanner(System.in);
		for (int i = 0; i < filmat; i++) {
			nota = 0;
			for (int j = 0; j < regjizoret; j++) {
				System.out.println("Jepni noten per filmin " + i);
				reviewt[i][j] = input.nextInt();
				nota += reviewt[i][j];

			}
			System.out.println("Per filmin e " + i + " notat e dhena nga regjizoret jane: " + nota);
			vleresimiTotalFilm[i] = nota;
			System.out.println(vleresimiTotalFilm[i]);
		}

		int max = vleresimiTotalFilm[0];
		int indexFilmi = 0;
		for (int i = 1; i < 5; i++) {
			if (vleresimiTotalFilm[i] > max) {
				max = vleresimiTotalFilm[i];
				indexFilmi = i;
			}
		}
		System.out.println("Filmi me vleresim me te larte (" + max + ") eshte filmi me index " + indexFilmi);
	}
}
