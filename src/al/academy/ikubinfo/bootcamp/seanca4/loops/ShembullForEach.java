package al.academy.ikubinfo.bootcamp.seanca4.loops;

import java.util.ArrayList;
import java.util.List;

public class ShembullForEach {

	public static void main(String[] args) {

		List<String> emra = new ArrayList<>();
		emra.add("Student1");
		emra.add("Student2");
		emra.add("Student3");

		int[] numra = { 1, 2, 3, 4, 5 };
		for (String emer : emra) {
			System.out.println("Emri : " + emer);
		}

		for (int numer : numra) {
			System.out.println("Numri: " + numer);
		}
	}

}
