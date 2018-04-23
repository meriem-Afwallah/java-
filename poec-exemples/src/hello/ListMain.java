package hello;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain {

	public static void main(String[] args) {
		ArrayList<Shape> myList = new ArrayList<Shape>();//<parametre de la list>
		//LinkedList<Shape> myList = new LinkedList<Shape>();
		
		myList.add(new Rectangle(0, 0));
		myList.add(new Circle());
	
		
		System.out.println(myList.get(2));
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(myList.get(i));
		}
		for (Shape shape : myList) {
			System.out.println(shape);
		}
		

	}

}
