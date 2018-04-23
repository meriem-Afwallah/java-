package hello;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] tab = {1, 2, 3, 4, 5, 6};
		
		System.out.println(tab[0]);
		System.out.println(tab[5]);
		
		tab[0] = 42;
		System.out.println(tab[0]);
		System.out.println(tab.length);
		
		// créer un tableau de String 
		//qui contient "hello"et "world"

		String[] tabDeString = {"hello", "world"};
		System.out.println(tabDeString[0]);
		System.out.println(tabDeString.length);
		
		
		// int [] tab = {1, 2, 3, 4, 5, 6};
		int[] tabDeTaille6 = new int[6];
		// on a créer un tableau , dont on connait pas les élèments
		tabDeTaille6[0] = 156;
		System.out.println(tabDeTaille6 [0]);
		System.out.println(tabDeTaille6 [1]);
		
		for (int i = 0; i < tabDeTaille6.length; i++) {
			System.out.println(tabDeTaille6[i]);
		}
		String[] tabDeString3 = new String[3];
		for (int i = 0; i < tabDeString3.length; i++) {
			System.out.println(tabDeString3[i]);
		}
		
	}

}
