package al.academy.ikubinfo.bootcamp.seanca5.ushtrime;

import java.util.*;

public class Usht8Seanca5 {

	public static void mesatarja() {

		//
		Scanner input = new Scanner(System.in);

		int notat = 0;
		int mesatarja = 0;
		int[][] notatEdhena = new int[10][5];
		int[] mesatarjaNotaveArray1D = new int[10];
		int mesatarjaMeLarte = mesatarjaNotaveArray1D[0];

		for (int i = 0; i < notatEdhena.length; i++) {
			for (int j = 0; j < notatEdhena[i].length; j++) {
				System.out.println("Jepni notat: ");
				notatEdhena[i][j] = input.nextInt();
				notat += notatEdhena[i][j];

			}
			mesatarja = notat / 5;
			mesatarjaNotaveArray1D[i] = mesatarja;
			notat = 0;
		}
		for (int x = 1; x < mesatarjaNotaveArray1D.length; x++) {
			System.out.print(mesatarjaNotaveArray1D[x] + " ");
			if (mesatarjaNotaveArray1D[x] > mesatarjaMeLarte)
				mesatarjaMeLarte = mesatarjaNotaveArray1D[x];
		}
		System.out.println();
		System.out.println("Mesatarja me e larte eshte: " + mesatarjaMeLarte);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mesatarja();

	}

}
