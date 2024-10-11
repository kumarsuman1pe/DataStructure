package DataStructure.Interview.com.deloite;
abstract class Vehicle {
	int price = 1000;

	abstract void vehiclePrice();
}

class Bike extends Vehicle {
	int price = 500;

	@Override
	public void vehiclePrice() {
		System.out.println("price of bike is " + price);
	}
}
