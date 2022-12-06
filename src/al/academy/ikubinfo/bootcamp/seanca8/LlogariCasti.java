package al.academy.ikubinfo.bootcamp.seanca8;

public class LlogariCasti extends Llogaria {

	private double limitOverdraft;

	public LlogariCasti(double limitOverdraft) {
		super();
		this.limitOverdraft = limitOverdraft;
	}

	public double getLimitOverdraft() {
		return limitOverdraft;
	}

	public void setLimitOverdraft(double limitOverdraft) {
		this.limitOverdraft = limitOverdraft;
	}

	public double terhiqShume(int shuma) {
		double balancaMeOverdraft = super.getBalanca() + this.limitOverdraft;
		double balanca = super.getBalanca();
		if (shuma > balancaMeOverdraft) {
			System.out.println("shuma e kerkuar nuk mund te terhiqet, ka kaluar balance+ overdraft!");
		} else {
			// opsioni i pare
			if ((balancaMeOverdraft - shuma) < limitOverdraft) {
				balanca = 0;
				this.limitOverdraft = balancaMeOverdraft - shuma;
			} else {
				balanca = balanca - shuma;
			}

			// opsioni i dyte
			/*
			 * if(shuma == balanca) { balanca = 0; } else if(shuma < balanca) { balanca =
			 * balanca - shuma; } else { balanca = 0; this.limitOverdraft =
			 * balancaMeOverdraft - shuma; }
			 */

			// opsioni i trete
			/*
			 * if(shuma < balanca) { balanca = balanca - shuma; } else { balanca = 0;
			 * this.limitOverdraft = balancaMeOverdraft - shuma; }
			 */

		}

		setBalanca(balanca);
		return getBalanca();
	}

}
