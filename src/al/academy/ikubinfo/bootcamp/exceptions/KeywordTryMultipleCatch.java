package al.academy.ikubinfo.bootcamp.exceptions;

import al.academy.ikubinfo.bootcamp.LlogariBankare;

public class KeywordTryMultipleCatch {

	public static void main(String[] args) {

	}

	static void metodaPare() {

		try {
			System.out.println("Statement i pare");
			System.out.println("Statement meposhte pengon ekzekutimin normal");
			LlogariBankare llogariBankare = null;
			llogariBankare.account("Adis");
			System.out.println("***Statement qe nuk do te ekzekutohet***");
		} catch (ArithmeticException exception) {
			System.out.println("ArithmeticException");
		} catch (NullPointerException exception) {
			System.out.println("NullPointerException");
		} catch (Exception exception) {
			System.out.println("Null pointer exception");
		}

		System.out.println("Statement qe ekzekutohet ne perfundim te programit");
	}

	// nuk kompilohet sepse kemi problem me renditjen e klasave te exception
	/*
	 * static void metodaPare() {
	 * 
	 * try { System.out.println("Statement i pare");
	 * System.out.println("Statement meposhte pengon ekzekutimin normal");
	 * LlogariBankare llogariBankare = null; llogariBankare.account("Adis");
	 * System.out.println("***Statement qe nuk do te ekzekutohet***"); } catch
	 * (Exception exception) {
	 * System.out.println("Trajtohet exception i hedhur ne bllokun 'try'"); } catch
	 * (NullPointerException exception) {
	 * System.out.println("Null pointer exception"); }
	 * 
	 * System.out.println("Statement qe ekzekutohet ne perfundim te programit"); }
	 */
}
