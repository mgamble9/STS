package objectmaster;

public class Human {
	
	private int health;
	private int strength;
	private int intelligence;
	private int stealth;

	public Human() {
		health = 100;
		strength = 3;
		intelligence = 3;
		stealth = 3;
	}
	
	public void attack(Human victim) {
		victim.health -= this.strength;
		System.out.println("Damage was: " + this.strength + " Health is now:" +
				victim.health);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
}
