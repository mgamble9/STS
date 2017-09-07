package zookeeper1;

public class Gorilla extends Mammal {

	public void throwSomething() {
		System.out.println("Gorilla throws banana.");
		energyLevel -= 5;
	}
	
	public void eatBanana() {
		System.out.println("Gorilla eats banana.");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla climbs tree.");
		energyLevel -= 10;
	}
}
