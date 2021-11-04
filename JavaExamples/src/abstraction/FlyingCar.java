package abstraction;

public abstract class FlyingCar {
	public  void startCar() {
		System.out.println("put the key and rotate ignition");
	}
	public abstract void stopCar();
	public abstract void flyCar();  // hitting the gas pedal or switiching on propellers
	public abstract void landCar();


}
