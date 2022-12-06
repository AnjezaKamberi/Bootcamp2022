package al.academy.ikubinfo.bootcamp.exceptions;

import al.academy.ikubinfo.bootcamp.LlogariBankare;

public class KeywordTrySingleCatch {

	public static void main(String[] args) {

		try {

			System.out.println("Statement i pare");
			System.out.println("Statement meposhte pengon ekzekutimin normal");
			LlogariBankare llogariBankare = null;
			llogariBankare.account("Adis");
			System.out.println("***Statement qe nuk do te ekzekutohet***");
		} catch (Exception exception) {
			System.out.println("Trajtohet exception i hedhur ne bllokun 'try'");
		}

		System.out.println("Statement qe ekzekutohet ne perfundim te programit");
	}
}
