package codingexercise.constructor;

class Vehicle {

	int maxSpeed = 120;
	Vehicle() {
		System.out.println("THIS IS A VEHICLE CONSTRUCTOR!");
	}
	
	Vehicle(int maxSpeed) {
		System.out.println("THIS IS VEHICLE CONSTRUCTOR WITH MAX SPEED");
		this.maxSpeed = maxSpeed;
	}
	
	public void honk() {
		System.out.println("vroom Vroom!");
	}
	
	
}

class Car extends Vehicle{
	
	int maxSpeed = 100;
	
	Car() {
		super();
		System.out.println("THIS IS A CAR CONSTRUCTOR!");
	}
	
	public void display() {
		System.out.println(super.maxSpeed);
	}
	
	public void honk() {
		//System.out.println("Skkurrttt!");
		super.honk();
	}

}

