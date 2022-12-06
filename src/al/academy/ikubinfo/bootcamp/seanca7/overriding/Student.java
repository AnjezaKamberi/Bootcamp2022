package al.academy.ikubinfo.bootcamp.seanca7.overriding;

public class Student extends Person {

	public Student(String emri, String mbiemri) {
		super(emri, mbiemri);
	}

	/*
	 * public String getEmri() { return "Studenti(/ja) " + super.getEmri(); }
	 */

	// override i gabuar.. na dergon ne Stack overflow

	/*
	 * @Override public String getEmri() { return "Studenti(/ja) " + getEmri(); }
	 */

	// metoda e meposhtme nuk eshte override i metodes te klasa parent

	/*
	 * public String getEmriStudent() { return "Studenti(/ja) " + super.getEmri(); }
	 */

	// nuk mund te ulim vizibilitetin

	/*
	 * @Override protected String getEmri() { return "Studenti(/ja) " +
	 * super.getEmri(); }
	 */
}
