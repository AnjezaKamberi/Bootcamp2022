package al.academy.ikubinfo.bootcamp.seanca8;

public class Llogaria {
	private double balanca;

	public Llogaria() {
		this(200);

	}

	public Llogaria(double balanca) {
		this.balanca = balanca;
	}

	public double getBalanca() {
		return this.balanca;
	}

	public void setBalanca(double balanca) {
		this.balanca = balanca;
	}

	public double depozitoShume(int shume) {
		if (shume < 0) {
			System.out.println("shuma negative nuk mund te depozitohet");
		} else {
			this.balanca += shume;
		}
		return this.balanca;
	}

	public double terhiqShume(int shuma) {
		if (shuma > this.balanca) {
			System.out.println("shuma e kerkuar nuk mund te terhiqet");
		} else {
			this.balanca = this.balanca - shuma;
		}
		return this.balanca;
	}

}
