package al.academy.ikubinfo.bootcamp.seanca6;

public class KlasaFemije extends KlasaPrind {

	public void printoMesazh() {
		System.out.println("Mesazhi qe do printohet eshte shkruar te klasa FEMIJE!");
	}

	// nese duam te printojme gjithcka eshte implementuar te metoda e klases PARENT

	/*
	 * public void printoMesazh() { super.printoMesazh();
	 * System.out.println("Mesazhi qe do printohet eshte shkruar te klasa FEMIJE!");
	 * }
	 */

	// perdorimi i keyword-it super jo ne statement-in e pare te ekzekutueshem
	// brenda metodes qe po behet override

	/*
	 * public void printoMesazh() { super.printoMesazh();
	 * System.out.println("Mesazhi qe do printohet eshte shkruar te klasa FEMIJE!");
	 * }
	 */

	// zvogelimi i vizibilitetit te metodes qe do behet override

	/*
	 * private void printoMesazh() {
	 * System.out.println("Mesazhi qe do printohet eshte shkruar te klasa FEMIJE!");
	 * }
	 */

}
