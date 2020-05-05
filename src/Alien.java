

public class Alien implements Movable, Clonable  {
	private int health = 10;
	private String name = "";
	public Alien(String name) {
	    this.name = name;
	  }
	public int getHealth() {
		return health;
	}
	public void setHealth(int newValue) {
		health = newValue;
	}
	public String getName() {
		return name;
	}
	@Override
	public void move(int meters) {
		System.out.println("I have moved " + meters + " meters.");		
	}
	@Override
	public Alien clone(Alien alien) {
		Alien marsian = new Alien(alien.getName());
		return marsian;
	}
}
