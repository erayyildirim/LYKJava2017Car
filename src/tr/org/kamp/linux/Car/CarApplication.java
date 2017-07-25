package tr.org.kamp.linux.Car;

public class CarApplication {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setSpeed(100);
		myCar.setGear(3);
		myCar.setBrand("Audi");
		
		Car myCar2 = new Car(4,150, "BMW");
		
		System.out.println("Mycar hızı= " + myCar.getSpeed() + " vites=" + myCar2.getGear());
		
		System.out.println("myCar2 hızı= "+ myCar2.getSpeed());
		myCar2.speedUp(20);
		System.out.println("myCar2 hızı= "+ myCar2.getSpeed()+ " vites =" + myCar2.getGear());
		
		myCar2.changeGear(5);
		System.out.println("myCar2 hızı= "+ myCar2.getSpeed()+ " vites =" + myCar2.getGear());
	}

}
