package al.academy.ikubinfo.bootcamp.seanca4.loops;

public class ShembullReturn {

	int getDyfishNumerCift(int numer) {
		
		if (numer % 2 != 0) {
			System.out.println("Numri qe ju keni dhene si parameter eshte numer jo cift");
			return -1;
		}

		
		System.out.println("Numri dyfish eshte " + numer * 2);
		return numer * 2;
	}
	
	
	
	void printoDyfishVleraPerNumerCift(int numer) {

		if (numer % 2 != 0) {
			System.out.println("Numri qe ju keni dhene si parameter eshte numer jo cift");
			return;
		}

		
		System.out.println("Numri dyfish eshte " + numer * 2);
		
	}

	public static void main(String[] args) {

		ShembullReturn shembullObj = new ShembullReturn();
		shembullObj.getDyfishNumerCift(5);
		shembullObj.getDyfishNumerCift(6);

	}

}
