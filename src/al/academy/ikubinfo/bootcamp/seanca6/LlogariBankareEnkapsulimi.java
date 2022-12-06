package al.academy.ikubinfo.bootcamp.seanca6;

public class LlogariBankareEnkapsulimi {

	public LlogariBankareEnkapsulimi() {}
	private double shuma;
	// public double shuma;

	// accessor method - getter
	public double getShuma() {
		return shuma;
	}

	// mutator method - setter
	public void setShuma(double shuma) {
		if (shuma > 0) {
			this.shuma = shuma;
		}
	}

}
