package al.academy.ikubinfo.bootcamp.seanca6;

public class LlogariBankare {

	private int shuma;
	private String emriPunonjesi;
	private boolean active;

	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getShuma() {
		return this.shuma;
	}

	public void setShuma(int shuma) {

		if (shuma < 0) {
			System.out.println("nuk lejohet qe te kemi llogari bankare me vlere negative");
			shuma = 0;
		}
		this.shuma = shuma;

	}

	public LlogariBankare() {
		System.out.println("jemi te konstruktori pa param");
	}
}
