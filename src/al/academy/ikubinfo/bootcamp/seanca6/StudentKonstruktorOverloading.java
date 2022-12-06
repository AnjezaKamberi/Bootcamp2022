package al.academy.ikubinfo.bootcamp.seanca6;

public class StudentKonstruktorOverloading {

	private String emri;
	private String mbiemri;
	private int vitStudimi;

	public StudentKonstruktorOverloading(String emri) {
		this.emri = emri;
		this.mbiemri = "Balla";
	}
	

	public StudentKonstruktorOverloading(int vitStudimi) {
		///set var instanca 
	}

	public StudentKonstruktorOverloading(String emri, String mbiemri) {
		this.emri = emri;
		this.mbiemri = mbiemri;
	}

	public StudentKonstruktorOverloading(String emri, String mbiemri, int vitStudimi) {
		this.emri = emri;
		this.mbiemri = mbiemri;
		this.vitStudimi = vitStudimi;
	}
}
