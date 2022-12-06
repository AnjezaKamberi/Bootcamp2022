package al.academy.ikubinfo.bootcamp.seanca7.overriding;

public class Person {

	private String emri;
	private String mbiemri;

	public Person(String emri, String mbiemri) {
		super();
		this.emri = emri;
		this.mbiemri = mbiemri;
	}

	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public String getMbiemri() {
		return mbiemri;
	}

	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}

}
