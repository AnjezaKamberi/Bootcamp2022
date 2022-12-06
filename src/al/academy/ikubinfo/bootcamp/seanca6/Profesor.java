package al.academy.ikubinfo.bootcamp.seanca6;

public class Profesor extends Person {

	private String profili;

	public String getProfili() {
		return profili;
	}

	public void setProfili(String profili) {
		this.profili = profili;
	}

	public void printoSth() {
		System.out.println("emri i profesorit eshte " + emri);
	}
}
