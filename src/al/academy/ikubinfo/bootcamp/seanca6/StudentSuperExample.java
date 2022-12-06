package al.academy.ikubinfo.bootcamp.seanca6;

public class StudentSuperExample extends Person {

	private int vitAkademik;

	public StudentSuperExample() {
		super();
		System.out.println("StudentSuperExample - konstruktori pa parametra");
	}

	public StudentSuperExample(String emri, String mbiemri) {
	//	super(emri, mbiemri);
		System.out.println("StudentSuperExample - konstruktori pa parametra");
	}

	/*
	 * public StudentSuperExample(String emri, String mbiemri) { super();
	 * System.out.println("StudentSuperExample - konstruktori pa parametra"); //
	 * perdorim i gabuar i super() super(emri, mbiemri); }
	 */

	public StudentSuperExample(String emri) {
		this();
		System.out.println("StudentSuperExample - konstruktori me nje parameter");
	}

	public StudentSuperExample(int vitAkademik) {
		// mund te therrasim kedo konstruktor nga parent, pavaresisht sa parametra ka
		// child apo parent
		//super("Astrit", "Demiri");
		System.out.println("StudentSuperExample - konstruktori me nje parameter");
	}
}
