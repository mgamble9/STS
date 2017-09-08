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
		
	}

}
