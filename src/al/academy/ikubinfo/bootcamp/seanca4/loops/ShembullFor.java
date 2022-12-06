package al.academy.ikubinfo.bootcamp.seanca4.loops;

import java.util.Scanner;

public class ShembullFor {

	private Scanner input = new Scanner(System.in);

	void printoNumratMidis(int nga, int deriNe) {

		for (int fillimi = nga; fillimi < deriNe; fillimi = fillimi + 2) {
			System.out.println("Vlera aktuale me hap 2 eshte " + fillimi);
		}

		for (; nga <= deriNe; nga++) {
			System.out.println("Vlera aktuale eshte " + nga);
		}
	}

	int merrShumaDeriNeNumer(int numer) {
		int shuma = 0;

		for (int fillimi = 1; fillimi <= numer; fillimi++) {
			shuma = shuma + fillimi;
		}
		return shuma;

	}

	public static void main(String[] args) {

		ShembullFor shembullObj = new ShembullFor();
		//shembullObj.printoNumratMidis(2, 14);
		System.out.println("Jep numer limit: ");
		int inputNumer = shembullObj.input.nextInt();
		int shuma = shembullObj.merrShumaDeriNeNumer(inputNumer);
		System.out.println("Shuma totale e numrave deri ne " + inputNumer + " eshte " + shuma);
	}
}
