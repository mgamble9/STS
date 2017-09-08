package objectmaster;

public class ObjectMasterTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human alph = new Human();
		Human bob = new Human();
		
		alph.attack(bob);
		alph.attack(bob);
		alph.attack(bob);
		bob.attack(alph);
	
		Wizard westley = new Wizard();
		westley.fireball(alph);
		westley.heal(alph);
		westley.fireball(westley);
		
		Ninja nancy = new Ninja();
		nancy.steal(westley);
		nancy.runaway();
		
		Samurai sam = new Samurai();
		Samurai zatoichi = new Samurai();
		Samurai shintaro = new Samurai();
		sam.deathBlow(bob);
		westley.fireball(sam);
		sam.meditate();
		westley.heal(bob);
		sam.howMany();
		System.out.println(Samurai.numberOfSamurai);
	}

}
