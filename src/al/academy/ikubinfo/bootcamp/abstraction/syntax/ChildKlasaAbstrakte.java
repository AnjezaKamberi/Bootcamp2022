package al.academy.ikubinfo.bootcamp.abstraction.syntax;

public class ChildKlasaAbstrakte extends KlasaAbstrakte {

	private int[] atributi4;

	// implementimi default
	/*
	 * public ChildKlasaAbstrakte(int[] atributi4) { super(); this.atributi4 =
	 * atributi4; }
	 */

	public ChildKlasaAbstrakte(int[] atributi4) {
		//super("vlera atributi1", 0, true);
		super();
		this.atributi4 = atributi4;
	}

	public int[] getAtributi4() {
		return atributi4;
	}

	public void setAtributi4(int[] atributi4) {
		this.atributi4 = atributi4;
	}

}
