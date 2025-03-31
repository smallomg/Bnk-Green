package vo1;

public class Animal_main {

	public static void main(String[] args) {

		/*
		 * Dog dog = new Dog(); Cat cat = new Cat(); Tiger tiger = new Tiger();
		 * dog.cry(); cat.cry(); tiger.cry();
		 */

		Animal animal = new Animal();

		Animal d = new Dog();
		Animal c = new Cat();
		Animal t = new Tiger();

		d.cry();
		c.cry();
		t.cry();

		Animal a[] = new Animal[3];

		a[0] = d;
		a[1] = c;
		a[2] = t;

		for (int i = 0; i < a.length; i++) {
			a[i].cry();

		}
	}

}
