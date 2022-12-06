package al.academy.ikubinfo.bootcamp.abstraction.examples;

public abstract class MjetTransporti {

	public abstract void start();

	public abstract void leviz();

	public abstract void stop();
	
	public int getNrRrota();
	
	public void getTimoni() {
		System.out.println("timoni eshte i perbashket per te treja...");
	}

}
