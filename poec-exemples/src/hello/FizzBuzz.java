package hello;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println("fizz" + 3);
		// Ecrire un programme pour tous les nombres de 0 à 100 inclus
		// affiche "nombre FIZZ" si nombre est multiple de 3
		// affiche "nombre BUZZ" si nombre est multiple de 5
		// affiche "nombre FIZZBUZZ" si nombre est multiple de 3 ET de 5

		// for (int i = 0; i <= 100; i++) {
		// if (i % 3 == 0) {
		// System.out.println(i + "FIZZ");
		// }
		// if (i % 5 == 0) {
		// System.out.println(i + "BUZZ");
		// } else if (i % 15 == 0) {
		// System.out.println("i + FIZZBUZZ");
		// } else {
		// System.out.println(i);
		// }
		// }

		// Correction

		for (int i = 0; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + "FIZZBUZZ");
			} else if (i % 3 == 0) {
				System.out.println(i + "FIZZ");
			   }
				if (i % 5 == 0) {
				System.out.println(i + "BUZZ");
				}

		}

	}

}
