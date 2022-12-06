package al.academy.ikubinfo.bootcamp.exceptions;

import al.academy.ikubinfo.bootcamp.LlogariBankare;

public class KeywordTryFinallyNotExecuted {

	public static void main(String[] args) throws Exception {

		// metodaPare();
		// metodaDyte();
		// System.out.println("Rezultati i thirrjes se metodes se katert eshte " +
		// metodaKater());
		metodaPese();
	}

	static void metodaPare() {
		try {
			System.out.println("Statement i pare");
			System.out.println("Statement meposhte pengon ekzekutimin normal");
			LlogariBankare llogariBankare = null;
			llogariBankare.account("Adis");
			System.exit(0);
		} catch (Exception exception) {
			System.out.println("Trajtohet exception i hedhur ne bllokun 'try'");
			System.exit(0);
		} finally {
			System.out.println(
					"Ekzekutohet edhe nese ka exceptions edhe nese nuk ka! Nese ka exceptions, \n exekutohet pasi bllokut 'catch', nese nuk ka exceptions, atehere exekutohet pas bllokut 'try'");
			System.exit(0);
		}

		System.out.println("Statement qe ekzekutohet ne perfundim te programit");
	}

	// 1. nese kemi exception atehere blloku 'finally' ekzekutohet edhe pse kemi
	// statement-in 'return'(te blloku 'catch' ose te blloku 'try'), por line-i
	// pas bllokut 'finally' nuk ekzekutohet

	// 2. nese nuk hidhet exception, atehere blloku finally ekzekutohet, se bashku
	// me statement pas bllokut 'finally'
	static void metodaDyte() {
		try {
			System.out.println("Statement i pare");
			System.out.println("Statement meposhte pengon ekzekutimin normal");
			LlogariBankare llogariBankare = null;
			llogariBankare.account("Adis");
		} catch (Exception exception) {
			System.out.println("Trajtohet exception i hedhur ne bllokun 'try'");
			return;
		} finally {
			System.out.println(
					"Ekzekutohet edhe nese ka exceptions edhe nese nuk ka! Nese ka exceptions, \n exekutohet pasi bllokut 'catch', nese nuk ka exceptions, atehere exekutohet pas bllokut 'try'");
		}

		System.out.println("Statement qe ekzekutohet ne perfundim te programit");
	}

	// rreshti i fundit nuk kompilohet
	/*
	 * static void metodaTrete() { try { System.out.println("Statement i pare");
	 * System.out.println("Statement meposhte pengon ekzekutimin normal");
	 * LlogariBankare llogariBankare = null; // llogariBankare.account("Adis");
	 * return; } catch (Exception exception) {
	 * System.out.println("Trajtohet exception i hedhur ne bllokun 'try'"); return;
	 * } finally { System.out.println(
	 * "Ekzekutohet edhe nese ka exceptions edhe nese nuk ka! Nese ka exceptions, \n exekutohet pasi bllokut 'catch', nese nuk ka exceptions, atehere exekutohet pas bllokut 'try'"
	 * ); }
	 * 
	 * System.out.println("Statement qe ekzekutohet ne perfundim te programit"); }
	 */

	static int metodaKater() {
		try {
			System.out.println("Statement i pare");
			System.out.println("Statement meposhte pengon ekzekutimin normal");
			LlogariBankare llogariBankare = null;
			// llogariBankare.account("Adis");
			return 5;
		} catch (Exception exception) {
			System.out.println("Trajtohet exception i hedhur ne bllokun 'try'");
			// return 7;
		} finally {
			System.out.println(
					"Ekzekutohet edhe nese ka exceptions edhe nese nuk ka! Nese ka exceptions, \n exekutohet pasi bllokut 'catch', nese nuk ka exceptions, atehere exekutohet pas bllokut 'try'");
		}

		System.out.println("Statement qe ekzekutohet ne perfundim te programit");
		return 9;
	}

	static void metodaPese() throws Exception {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			throw new RuntimeException();
		} finally {
			// ky exception e mbivendos exceptionin e bllokut 'catch'
			throw new Exception();
		}
	}
}
