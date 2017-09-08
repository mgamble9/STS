package zookeeper1;

public class DragonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dragon d = new Dragon();
		d.fly();
		d.eatHumans();
		d.displayEnergy();
		d.eatHumans().eatHumans().eatHumans();
		d.displayEnergy();
		d.attackTown();
		d.displayEnergy();
	}

}
