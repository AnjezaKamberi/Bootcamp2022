package al.academy.ikubinfo.bootcamp.seanca5.ushtrime;

public class Ushtrimi7 {
	public static void main(String[] args) {
		boolean rezultati = shumaEDiagonaleve();

		System.out.println("vlera te rezultati eshte : " + rezultati);
		if (rezultati) {
			System.out.println("Shuma e fiagonaleve te matrics eshte e barabarte .");

		} else {
			System.out.println("Shuma e fiagonaleve te matrics nuk eshte e barabarte .");
		}

	}

	public static boolean shumaEDiagonaleve() {

		int[][] array = new int[][] { { 2, 3, 5 }, { 3, 4, 5 }, { 4, 5, 6 } };
		int diagonale1 = 0;
		int diagonale2 = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < (array[i].length); j++) {

				if (i == j) {
					diagonale1 += array[i][j];
				}
				if (j == array.length - i - 1) {
					diagonale2 += array[i][j];
				}

			}

		}

		return diagonale1 == diagonale2;

	}

}
