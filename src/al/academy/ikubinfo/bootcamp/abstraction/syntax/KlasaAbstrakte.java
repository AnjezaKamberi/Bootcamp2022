package al.academy.ikubinfo.bootcamp.abstraction.syntax;

public abstract class KlasaAbstrakte {

	private String atributi1;
	private int atributi2;
	private boolean atributi3;

	/*
	 * public KlasaAbstrakte(String atributi1, int atributi2, boolean atributi3) {
	 * super(); this.atributi1 = atributi1; this.atributi2 = atributi2;
	 * this.atributi3 = atributi3; }
	 */

	public String getAtributi1() {
		return atributi1;
	}

	public void setAtributi1(String atributi1) {
		this.atributi1 = atributi1;
	}

	public int getAtributi2() {
		return atributi2;
	}

	public void setAtributi2(int atributi2) {
		this.atributi2 = atributi2;
	}

	public boolean isAtributi3() {
		return atributi3;
	}

	public void setAtributi3(boolean atributi3) {
		this.atributi3 = atributi3;
	}

	//public abstract void emriMetoda();
}
