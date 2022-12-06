package al.academy.ikubinfo.bootcamp.seanca5;

public class Yjet5c {

	public static void main(String[] args) {

		for (int i = 0; i < 7; i += 2) {
			
			for (int j = 7 - i; j > 1; j -= 2) {
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
					
			}
			System.out.println();
			
	}
}
}