package hello;

public class Dog extends Animal {

	
		
		public void bark() {
			System.out.println("woof");
		}
		public void debug() {
			System.out.println(name);
			
		}
		@Override
		public void makeSound() {
			super.makeSound();
			bark();
		}
		
	
}
