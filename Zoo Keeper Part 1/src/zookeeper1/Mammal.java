package zookeeper1;

public class Mammal {
	
	public int energyLevel = 100;
	//protected prevents "world" from changing it
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}
}
