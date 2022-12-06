package al.academy.ikubinfo.bootcamp.seanca6;

public class LeximShkrimVariabla {

	String variabliPare = "BOOTCAMP 2022";
	int variabliDyte = 5;
	String rezultati = variabliPare + " " +variabliDyte;
	
	public static void main(String[] args) {
		
		LeximShkrimVariabla objekt = new LeximShkrimVariabla();
		objekt.variabliPare = "BOOTCAMP 2022";
		System.out.println("Objekti i pare ka vleren: " + objekt.variabliPare);
	}
}
