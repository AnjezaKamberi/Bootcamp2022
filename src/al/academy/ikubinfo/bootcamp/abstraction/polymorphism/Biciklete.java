package al.academy.ikubinfo.bootcamp.abstraction.polymorphism;

public class Biciklete implements MjetTransporti {

	@Override
	public void start() {
		System.out.println("start biciklete");

	}

	@Override
	public void leviz() {
		System.out.println("leviz biciklete");

	}

	@Override
	public void stop() {
		System.out.println("stop biciklete");

	}

	@Override
	public int getNrRrota() {
		return 2;
	}

}
