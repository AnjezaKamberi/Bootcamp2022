package al.academy.ikubinfo.bootcamp.seanca4.loops;

import java.util.Scanner;

public class ShembullSwitch {

	void printoAngazhimPerDite(String dita) {
		
		switch (dita) {

		case "E HENE":
		case "E ENJTE":
			System.out.println("Kursi JAVA Bootcamp 2022");
			//break;
		case "E MARTE":
		case "E MERKURE":
		case "E PREMTE":
			System.out.println("Dite studimi");
			break;
		case "E SHTUNE":
		case "E DIELE":
			System.out.println("Dite pushimi");
			//break;
		default:
			System.out.println("Angazhim : -");
		}
		

	}

	
	
	String getDita(int numriDita) {
		String dita;
		switch (numriDita) {

		// Case
		case 1:
			dita = "E hene";
			break;

		// Case
		case 2:
			dita = "E marte";
			//break;

		// Case
		case 3:
			dita = "E merkure";
			//break;

		// Case
		case 4:
			dita = "E enjte";
			//break;

		// Case
		case 5:
			dita = "E premte";
			//break;

		// Case
		case 6:
			dita = "E shtune";
			//break;

		// Case
		case 7:
			dita = "E diele";
			//break;

		// Default case
		default:
			dita = " - ";
		}

		return dita;

	}

	public static void main(String[] args) {

		ShembullSwitch shembullObj = new ShembullSwitch();
		/*System.out.println("Ju lutem jepni diten per te cilen deshironi te shikoni angazhimet tuaja : ");
		Scanner input = new Scanner(System.in);
		String ditaInput = input.nextLine();
		shembullObj.printoAngazhimPerDite(ditaInput.toUpperCase());*/
		System.out.println("Dita e dyte e javes eshte : " + shembullObj.getDita(2));
	}
}
