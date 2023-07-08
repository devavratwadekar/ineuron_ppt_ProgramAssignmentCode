package in.ineuron.pptAssignmentJAVA_04;

//Define the interface
interface Vehicle {
	void start();

	void stop();
}

//Implement the interface in a class
class Car implements Vehicle {
	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
}

//Implement the interface in another class
class Motorcycle implements Vehicle {
	@Override
	public void start() {
		System.out.println("Motorcycle started");
	}

	@Override
	public void stop() {
		System.out.println("Motorcycle stopped");
	}
}

//Main program
public class InterfaceExample_1 {
	public static void main(String[] args) {
		// Create objects of the implementing classes
		Car car = new Car();
		Motorcycle motorcycle = new Motorcycle();

		// Use the interface methods
		car.start();
		car.stop();

		motorcycle.start();
		motorcycle.stop();
	}
}
