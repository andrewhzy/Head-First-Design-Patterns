package headfirst.designpatterns.singleton.subclass;

public class CoolerSingleton extends Singleton {
	// useful instance variables here
	public static Singleton uniqueInstance=new CoolerSingleton();
 
	private CoolerSingleton() {
		super();
	}
 
	// useful methods here
}
