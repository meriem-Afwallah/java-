package hello;

public class ShapeMain {

	public static void main(String[] args) {
		// cr�er une classe Rectangle
		//qui poss�de une m�thode
		//public int calcArea(int width, int height)
		Rectangle r1 = new Rectangle(10, 50);
		
		System.out.println(r1.calcArea());
		
		Circle c1 = new Circle();
		c1.r = 4;
		System.out.println(c1.calcArea());
		
		Shape[] tab = { r1, c1 };
		for (int i = 0; i < tab.length; i++) {
			
			Shape o = tab[i];
			System.out.println(o.calcArea());
			
		}
		
	

	}

}
