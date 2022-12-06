package al.academy.ikubinfo.bootcamp.exceptions;

public class ExceptionIntroduction {

	public static void main(String[] args) throws Exception {

		// printohet rezultati i pjestimit te numrit 100 me emerues nga -5 deri ne 5

		for (int numer = -5; numer < 6; numer++) {
			// kur vlera e numer = 0 atehere do te hidhet ArithmeticException qe nuk lejon
			// pjesetimin me 0
			int rezultat = 100 / numer;
			System.out.println("Rezultati i pjesetimit te numrit 100 me " + numer + " eshte: " + rezultat);
		}

		/*
		 * try { int arrayElemente[] = new int[5]; arrayElemente[5] = 4; } catch
		 * (ArrayIndexOutOfBoundsException e) { System.out.println(e); } finally {
		 * System.out.println("printohet pavaresisht errorit"); }
		 */
	}

}
