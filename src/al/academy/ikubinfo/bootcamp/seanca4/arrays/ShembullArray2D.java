package al.academy.ikubinfo.bootcamp.seanca4.arrays;

public class ShembullArray2D {

	// kalimi si parameter i nje matrice katrore
	static void listoElementPerArray(int[][] numraTePerzgjedhur) {
		
		int numriRreshta = numraTePerzgjedhur.length;
		
		int numriKolona = numraTePerzgjedhur[0].length;
		
		for (int i = 0; i < numriRreshta; i++) {
			
			for (int j = 0; j < numriKolona; j++) {

				System.out.println("Elementi ne rreshtin " + (i + 1) + " dhe kolonen " + (j + 1) + " eshte "
						+ numraTePerzgjedhur[i][j]);
			}
		}
	}

	// modifiko shembullin e mesiperm nese matrica nuk eshte katrore

	public static void main(String[] args) {

		int[][] array2D = { { 1, 2 }, { 3, 4 } };

		listoElementPerArray(array2D);
	}
}
