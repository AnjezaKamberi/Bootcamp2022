package al.academy.ikubinfo.bootcamp.seanca6;

public class VariablaInstanceThis {

	private String variabliPare;

	// ben asenjimin e duhur te parametrit te variabli i instances me te njejtin
	// emer
	// i nevojshem perdorimi i THIS
	/*
	 * public VariablaInstanceThis(String variabliPare) { this.variabliPare =
	 * variabliPare; }
	 */

	// ben asenjimin e parametrit te vet parametri dhe jo te variabli i instances
	/*
	 * public VariablaInstanceThis(String variabliPare) { variabliPare =
	 * variabliPare; }
	 */

	// ben asenjimin e duhur te parametrit te variabli i instances
	// NUK eshte i nevojshem perdorimi i THIS sepse emri i parametrit dhe variablit
	// te instances
	// jane te ndryshem
	/*public VariablaInstanceThis(String emriParam) {
		variabliPare = emriParam;
	}*/

	// ben asenjimin e duhur te parametrit te variabli i instances
	// NUK eshte i nevojshem perdorimi i THIS sepse emri i parametrit dhe variablit
	// te instances jane te ndryshem, POR nuk eshte problem edhe nese vendoset
	public VariablaInstanceThis(String emriParam) {
		this.variabliPare = emriParam;
	}
}
