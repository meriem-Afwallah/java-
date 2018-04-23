package hello;

public class Notes {

	public static void main(String[] args) {
		int[] notes = { 18, 20, 2, 14, 7, 10 };
		
		// 1)calculer la moyenne des notes

		int somme = 0;
		for (int i = 0; i < notes.length; i++) {

			somme = somme + notes[i];
		}
		System.out.println("somme:" + somme);
		double moyenne = (double)somme / notes.length;    // cast
		System.out.println("la moyenne des notes est " + moyenne);
		
		// 2) trouver la plus petite note
		
		int min = notes[0];
		for (int i = 0; i < notes.length; i++) {

			if (notes[i] < min) {
				min = notes[i];	
			} 
			System.out.println("min: " + min);
			
		}
		// 3) trouver la plus grande note
		int max = notes[0];
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] > max ) {
				max = notes[i];
			}
			System.out.println("max: " + max);
		}
		// 4) calculer la variance v+= (note[i] - moyenne *(notes[i] - moyenne)
		//
		// 5) calculer l'ecart type
	}
}
