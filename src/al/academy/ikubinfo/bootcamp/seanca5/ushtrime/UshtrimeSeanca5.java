package al.academy.ikubinfo.bootcamp.seanca5.ushtrime;

public class UshtrimeSeanca5 {

	public static void main(String[] args) {
		rowToCol();
	}

	public static void rowToCol() {
		int[][] array = new int[][] { { 2, 3, 4 }, { 3, 4, 5 } };
		int[][] arrayConverted = new int[3][2];
		
		for (int i = 0; i < arrayConverted.length; i++) {
			for (int j = 0; j < arrayConverted[i].length; j++) {
				arrayConverted[i][j] = array[j][i];
				System.out.print(arrayConverted[i][j] + " ");
			}
			System.out.println();
		}

	}
	
	
	

}
