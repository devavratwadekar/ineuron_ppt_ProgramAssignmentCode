package in.ineuron.pptAssignmentJAVA_03;

class Animal {
	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Meow! The cat purrs.");
	}

	public void scratch() {
		System.out.println("The cat scratches.");
	}
}

public class AnimalTest_2 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.makeSound(); // Output: The animal makes a sound.

		Cat cat = new Cat();
		cat.makeSound(); // Output: Meow! The cat purrs.
		cat.scratch(); // Output: The cat scratches.

		// Upcasting
		Animal anotherAnimal = new Cat();
		anotherAnimal.makeSound(); // Output: Meow! The cat purrs.

		// Downcasting
		Cat anotherCat = (Cat) anotherAnimal;
		anotherCat.scratch(); // Output: The cat scratches.
	}
}
