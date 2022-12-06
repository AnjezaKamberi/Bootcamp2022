package al.academy.ikubinfo.bootcamp.seanca7.overriding;

public class Profesor extends Person {

	public Profesor(String emri, String mbiemri) {
		super(emri, mbiemri);
	}

	public String getEmri() {
		return "Profesor(/esh) " + super.getEmri();
	}

}
