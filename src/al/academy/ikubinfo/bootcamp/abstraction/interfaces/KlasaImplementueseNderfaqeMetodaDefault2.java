package al.academy.ikubinfo.bootcamp.abstraction.interfaces;

public class KlasaImplementueseNderfaqeMetodaDefault2 implements NderfaqeMetodaDefault, NderfaqeMetodaDefault2 {

	/*
	 * public int getVlereNumerike() { return 5; };
	 */

	// per te marre vleren qe ka nderfaqja e pare
	/*
	 * public int getVlereNumerike() { return
	 * NderfaqeMetodaDefault.super.getVlereNumerike(); };
	 */

	// per te marre vlerat qe ndodhen ne dy nderfaqet
	public int getVlereNumerike() {
		return NderfaqeMetodaDefault.super.getVlereNumerike() + NderfaqeMetodaDefault2.super.getVlereNumerike();
	};
}
