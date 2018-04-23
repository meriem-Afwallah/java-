package hello;

public class AnimalMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("medor");
		d.setAge(2);
		
		Cat c = new Cat();
		c.setName("fido");
		c.setAge(8);
		System.out.println(c.getName()+ ":"+ c.getAge());
		c.makeSound();
		
		Animal c2 = new Cat();
		c2.makeSound();
		// Cat c3 = new Animal(); ne marche pas, pcq un animal n'est pas forcement un chat
		
		Animal[] animals = { c, d };
		for (int i= 0;  i< animals.length; i++) {
			animals[i].makeSound();
		}
		
		
		//Animal a = new Animal(); //on ne peut pas instancier Animal
				

	}

}
