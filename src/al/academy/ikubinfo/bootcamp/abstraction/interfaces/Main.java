package al.academy.ikubinfo.bootcamp.abstraction.interfaces;

public class Main {

	public static void main(String[] args) {
		NderfaqeMetodaStatike objekt = new KlasaImplementueseNderfaqeMetodaStatike();
		// objekt.printPermbajtjeKursi();

		KlasaImplementueseNderfaqeMetodaDefault2 objektDefaultMethod = new KlasaImplementueseNderfaqeMetodaDefault2();
		System.out.println(objektDefaultMethod.getVlereNumerike());

	}
}
