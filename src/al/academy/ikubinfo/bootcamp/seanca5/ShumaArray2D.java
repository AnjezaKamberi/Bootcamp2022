package al.academy.ikubinfo.bootcamp.seanca5;

import java.util.Scanner;

public class ShumaArray2D {

	// shuma e elementeve per cdo rresht te nje array dy dimensional
	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		int shuma = 0;
		int[][] matrica = new int[n][m];
		Scanner skano = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println("Krijo matricen :");
				matrica[i][j] = skano.nextInt();
				shuma = shuma + matrica[i][j];
			}
			System.out.println("Shuma e rreshtit " + i + " eshte: " + shuma);
			shuma = 0;

		}
	}

}
