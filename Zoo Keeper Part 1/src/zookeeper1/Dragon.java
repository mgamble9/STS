package zookeeper1;

public class Dragon extends Mammal{

	public Dragon() {
		energyLevel = 300;
	}	
	
	public void fly() {
		System.out.println("Dragon flys.");
		energyLevel -= 50;
	}
	
	public Dragon eatHumans() {
		System.out.println("Dragon eats human.");
		energyLevel += 25;
		return this;
	}

	public void attackTown() {
		System.out.println("Dragon attacks town.");
		energyLevel -= 100;
	}

}
