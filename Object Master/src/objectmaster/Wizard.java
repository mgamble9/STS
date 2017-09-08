package objectmaster;

public class Wizard extends Human{

	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public void heal(Human patient) {
		int health = patient.getHealth() + this.getIntelligence();
		patient.setHealth(health);
		System.out.println("Heal Spell recipent's health is now: " + health);
	}
	
	public void fireball(Human victim) {
		int health = victim.getHealth() - 3*this.getIntelligence();
		victim.setHealth(health);
		System.out.println("Fireball Spell victim's health is now: " + health);
	}
}
