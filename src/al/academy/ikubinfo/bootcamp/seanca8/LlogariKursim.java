package al.academy.ikubinfo.bootcamp.seanca8;

public class LlogariKursim extends Llogaria {

	private double interes;

	public double getInteres() {
		return this.interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;

	}

	public LlogariKursim(double vlera) {
		super(vlera);
	}

	public double llogaritKursim(double vlerInteres) {
		this.interes = super.getBalanca() * vlerInteres;

		double c = super.getBalanca() + this.interes;
		super.setBalanca(c);
		return super.getBalanca();

	}

}
