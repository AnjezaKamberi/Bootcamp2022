package al.academy.ikubinfo.bootcamp.abstraction;

import al.academy.ikubinfo.bootcamp.abstraction.syntax.ChildKlasaAbstrakte;
import al.academy.ikubinfo.bootcamp.LlogariBankare;
import al.academy.ikubinfo.bootcamp.abstraction.examples.MjetTransporti;
import al.academy.ikubinfo.bootcamp.abstraction.interfaces.*;

public class KlasaAbstrakteMain   {

	public KlasaAbstrakteMain() {
		super();
	}
	
	public void getMetoda() {
		LlogariBankare f = new LlogariBankare();
	}
	
	public static void main(String[] args) {
		
		
		
		// krijojme objekt per nje klase abstrakte
		/*
		 * KlasaAbstrakte objekt = new KlasaAbstrakte();
		 * objekt.setAtributi1("vlera e atributit te pare");
		 */

		// krijojme objekt per nje femije abstract te superklases abstrakte
		/*
		 * ChildTip1KlasaAbstrakte objektFemije = new ChildTip1KlasaAbstrakte();
		 * objektFemije.
		 * setAtributi1("vlera e atributit te pare per klasen femije abstrakt");
		 */

		// krijojme objekt per nje femije te superklases abstrakte

		/*
		 * ChildTip2KlasaAbstrakte objektFemije = new ChildTip2KlasaAbstrakte();
		 * objektFemije.
		 * setAtributi1("vlera e atributit te pare per klasen femije jo abstrakt");
		 */

		// krijojme objekt per nje konstrukor me parametra
		//ChildKlasaAbstrakte objektFemije = new ChildKlasaAbstrakte(null);
		//objektFemije.setAtributi1("vlera e atributit te pare per klasen femije");
	}
}
