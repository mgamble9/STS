package objectmaster;

public class Samurai extends Human {

	static int numberOfSamurai = 0;
	
	public Samurai() {
		this.setHealth(200);
		numberOfSamurai++;
	}

	public void deathBlow(Human victim) {
		victim.setHealth(0);
		System.out.println("Samurai kills with death blow");
		int healthOfSamurai = this.getHealth()/2;
		this.setHealth(healthOfSamurai);
		System.out.println("Samurai's health is now: " +
				healthOfSamurai);
	}
	
	public void meditate() {
		int healthOfSamurai = this.getHealth()/2 + this.getHealth();
		this.setHealth(healthOfSamurai);
		System.out.println("Samurai's health after meditation is now: " +
				healthOfSamurai);
	}

	public void howMany() {
		System.out.println("The number of Samurai is: " + numberOfSamurai);		
	}
}
