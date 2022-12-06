package al.academy.ikubinfo.bootcamp.exceptions;

import java.io.FileNotFoundException;

public class DeclaringExceptions {

	public static void main(String[] args) {

	}

	static void metodaPare() throws Exception {

	}

	// metoda e pare e therritjes se 'metodaPare'
	static void metodaDyte() {
		try {
			metodaPare();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// metoda e dyte
	static void metodaTrete() throws Exception {
		metodaPare();
	}

	static void metodaKatert() {

	}

	// therritja e 'metodaKatert' nga nje checked exception
	/*
	 * static void metodaPeste() { try { metodaKatert(); } catch
	 * (FileNotFoundException exception) {
	 * 
	 * } }
	 */
}
