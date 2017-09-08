package objectmaster;

public class Ninja extends Human{

	public Ninja() {
		this.setStealth(10);
	}
	
	public void steal(Human victim) {
		int healthOfVictim = victim.getHealth() - this.getStealth();
		victim.setHealth(healthOfVictim);
		System.out.println("Ninja victim's health is now: " +
				healthOfVictim);
		int healthOfNinja = this.getHealth() + this.getStealth();
		this.setHealth(healthOfNinja);
		System.out.println("Ninja's health is now: " +
				healthOfNinja);
	}
	
	public void runaway() {
		this.setHealth(this.getHealth() - 10);
		System.out.println("Ninja's health after running away is now: " +
				this.getHealth());
	}
	
}
