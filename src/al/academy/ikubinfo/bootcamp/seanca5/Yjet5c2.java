package al.academy.ikubinfo.bootcamp.seanca5;

public class Yjet5c2 {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i*2;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
