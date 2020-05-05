
public class Car implements Movable,BackwardsMovable  {

	@Override
	public void move(int meters) {
		System.out.println("I have moved " + meters + " meters.");
		
	}

	@Override
	public void moveBackwards(int meters) {
		System.out.println("I have moved backwards " + meters + " meters.");
		
	}

}
