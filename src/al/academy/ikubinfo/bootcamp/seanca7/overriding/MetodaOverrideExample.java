package al.academy.ikubinfo.bootcamp.seanca7.overriding;

public class MetodaOverrideExample {

	public static void main(String[] args) {

		Person person = new Person("Benard", "Sula");
		//Profesor profesor = new Profesor("Astrit", "Demiri");
		Student student = new Student("Ardit", "Shehu");

		System.out.println("Emri : " + person.getEmri());
		//System.out.println("Emri : " + profesor.getEmri());
		System.out.println("Emri : " + student.getEmri());
	}
}
