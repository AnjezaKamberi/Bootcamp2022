package al.academy.ikubinfo.bootcamp.seanca4.arrays;

public class ShembullArray1D {

	void listoElementPerArray(int[] numraTePerzgjedhur) {

		for (int i = 0; i < numraTePerzgjedhur.length; i++) {

			System.out.println("Elementi ne indexin " + i + " eshte " + numraTePerzgjedhur[i]);
		}
	}

	void dyfishoVleratPerArray(int[] numraTePerzgjedhur) {
		for (int i = 0; i < numraTePerzgjedhur.length; i++) {

			numraTePerzgjedhur[i] = numraTePerzgjedhur[i] * 2; 
		}
	}
	public static void main(String[] args) {

		ShembullArray1D shembullArray1D = new ShembullArray1D();
		// int[] numraTePerzgjedhur = new int[5] {5, 25, 35, 78, 55};
		 int[] numraTePerzgjedhur = new int[] {5, 25, 35, 78, 55};
		// int[] numraTePerzgjedhur = {5, 25, 35, 78, 55};
		//int[] numraTePerzgjedhur;

		// inicializim pasi array eshte deklaruar
		// numraTePerzgjedhur = new int[]{2};

		// krijimi dhe inicializimi per cdo index
		/*
		 * numraTePerzgjedhur = new int[2]; numraTePerzgjedhur[0] = 5;
		 * numraTePerzgjedhur[1] = 10;
		 */

		// inicializim i gabuar
		// numraTePerzgjedhur = {5};

		// System.out.println("elementi " + numraTePerzgjedhur.length);
		
		 //kalimi me reference i nje array
		 //shembullArray1D.dyfishoVleratPerArray(numraTePerzgjedhur);
		 shembullArray1D.listoElementPerArray(numraTePerzgjedhur);
	}
}
