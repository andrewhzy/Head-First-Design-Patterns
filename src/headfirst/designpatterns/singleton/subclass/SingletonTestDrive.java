package headfirst.designpatterns.singleton.subclass;

public class SingletonTestDrive {
	public static void main(String[] args) {
		Singleton foo = CoolerSingleton.uniqueInstance;
		Singleton foo1 = CoolerSingleton.getInstance();
		Singleton bar = HotterSingleton.getInstance();
		System.out.println(foo);
		System.out.println(foo1);
		System.out.println(bar);
 	}
}
