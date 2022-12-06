package al.academy.ikubinfo.bootcamp.seanca6;

public class StudentKonstruktorChain {

	private String emri;
	private String mbiemri;
	private int vitStudimi;

	// therritje e gabuar, problem me kompilimin e kodit

	public StudentKonstruktorChain(String emri) {
	//	StudentKonstruktorChain(emri, mbiemri);
	}

	// kodi kompilohet, por nuk therret konstruktorin me dy parametra

	/*
	 * public StudentKonstruktorChain(String emri) { new
	 * StudentKonstruktorChain(emri, "Balla"); }
	 */

	// therritja e sakte

	/*
	 * public StudentKonstruktorChain(String emri) {
	 * 
	 * this(emri, "Balla", 2023);
	 * 
	 * System.out.
	 * println("jemi te konstruktori qe ka nje parameter dhe emri i studentit eshte "
	 * + this.emri);
	 * 
	 * }
	 * 
	 * public StudentKonstruktorChain(String emri, String mbiemri, int
	 * vitStudimiInput) {
	 * System.out.println("jemi te konstruktori qe ka dy parametra");
	 * 
	 * this.emri = emri; this.mbiemri = mbiemri;
	 * 
	 * vitStudimi = vitStudimiInput;
	 * System.out.println("variabli i instances vit studimi  ka vleren " +
	 * this.vitStudimi);
	 * System.out.println("variabli i kaluar si parameter vit studimi  ka vleren " +
	 * vitStudimi); }
	 * 
	 * public String getEmri() { return emri; }
	 * 
	 * public void setEmri(String emriInp) { emri = emriInp; }
	 */

	/*
	 * public String getEmri() { return this.emri; }
	 * 
	 * public void setEmri(String emri) { this.emri = emri; }
	 */

}
