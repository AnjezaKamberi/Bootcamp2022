package al.academy.ikubinfo.bootcamp.seanca6;

public class InstanceOfExample {

	public static void main(String[] args) {

		KlasaA objektA = new KlasaA();
		KlasaB objektB = new KlasaB();

		boolean objektAInstanceKlasaA = objektA instanceof KlasaA;
		boolean objektAInstanceKlasaB = objektA instanceof KlasaB;
		boolean objektBInstanceKlasaA = objektB instanceof KlasaA;
		boolean objektBInstanceKlasaB = objektB instanceof KlasaB;

		System.out.println("Objekti A eshte instance e 'KlasaA' " + objektAInstanceKlasaA);
		System.out.println("Objekti A eshte instance e 'KlasaB' " + objektAInstanceKlasaB);
		System.out.println("Objekti B eshte instance e 'KlasaA' " + objektBInstanceKlasaA);
		System.out.println("Objekti B eshte instance e 'KlasaB' " + objektBInstanceKlasaB);
	}

}
