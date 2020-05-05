
public class Main {

	public static void main(String[] args) {
		Alien marsian1 = new Alien("marsian");
		marsian1.move(5);
		Car car = new Car();
		car.move(6);
		Animal cat = new Animal();
		cat.move(7);
		car.moveBackwards(10);
		Alien marsian2 = marsian1.clone(marsian1);
	}

}
